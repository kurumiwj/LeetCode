//78. 子集
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
public:
	void backtracking(vector<int>& nums,int index){
		res.push_back(path);
		if(index>=nums.size()) return;
		for(int i=index;i<nums.size();i++){
			path.push_back(nums[i]);
			backtracking(nums,i+1);
			path.pop_back();
		}
	}
	vector<vector<int>> subsets(vector<int>& nums) {
		backtracking(nums,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
