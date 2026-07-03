//491. 非递减子序列
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
public:
	void backtracking(vector<int>& nums,int index){
		if(path.size()>1) res.push_back(path);
		bool visited[201]={false};
		for(int i=index;i<nums.size();i++){
			if(!path.empty()&&nums[i]<path.back()||visited[nums[i]+100]) continue;
			visited[nums[i]+100]=true;
			path.push_back(nums[i]);
			backtracking(nums,i+1);
			path.pop_back();
		}
	}
	vector<vector<int>> findSubsequences(vector<int>& nums) {
		backtracking(nums,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
