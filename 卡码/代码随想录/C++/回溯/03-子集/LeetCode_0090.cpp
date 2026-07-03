//90. 子集 II
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
public:
	void backtracking(vector<int>& nums,int index){
		res.push_back(path);
		if(index>=nums.size()) return;
		for(int i=index;i<nums.size();i++){
			if(i>index&&nums[i]==nums[i-1]) continue;
			path.push_back(nums[i]);
			backtracking(nums,i+1);
			path.pop_back();
		}
	}
	vector<vector<int>> subsetsWithDup(vector<int>& nums) {
		sort(nums.begin(),nums.end());
		backtracking(nums,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
