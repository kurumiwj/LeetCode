//46. 全排列
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
	vector<bool> visited;
public:
	void backtracking(vector<int>& nums){
		if(path.size()==nums.size()){
			res.push_back(path);
			return;
		}
		for(int i=0;i<nums.size();i++){
			if(visited[i]) continue;
			visited[i]=true;
			path.push_back(nums[i]);
			backtracking(nums);
			path.pop_back();
			visited[i]=false;
		}
	}
	vector<vector<int>> permute(vector<int>& nums) {
		visited.resize(nums.size(),false);
		backtracking(nums);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
