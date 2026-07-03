//239. 滑动窗口最大值
#include <vector>
#include <deque>
using namespace std;

class List{
	public:
		int front(){
			return q.front();
		}
		void push(int val){
			while(!q.empty()&&val>q.back()) q.pop_back();
			q.push_back(val);
		}
		void pop(int val){
			if(!q.empty()&&q.front()==val) q.pop_front();
		}
	private:
		deque<int> q;
};

class Solution {
public:
  vector<int> maxSlidingWindow(vector<int>& nums, int k) {
		vector<int> res;
		List list;
		for(int i=0;i<k;i++) list.push(nums[i]);
		res.push_back(list.front());
		for(int i=k;i<nums.size();i++){
			list.pop(nums[i-k]);
			list.push(nums[i]);
			res.push_back(list.front());
		}
		return res;
  }
};
