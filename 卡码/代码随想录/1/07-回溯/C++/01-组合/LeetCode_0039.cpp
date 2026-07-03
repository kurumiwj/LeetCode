//39. 组合总和
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
public:
	void backtracking(vector<int>& candidates,int target,int sum,int index){
		if(sum>target) return;
		if(sum==target){
			res.push_back(vector<int>(path));
			return;
		}
		for(int i=index;i<candidates.size()&&sum+candidates[i]<=target;i++){
			path.push_back(candidates[i]);
			backtracking(candidates,target,sum+candidates[i],i);
			path.pop_back();
		}
	}
	vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
		sort(candidates.begin(),candidates.end());
		backtracking(candidates,target,0,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
