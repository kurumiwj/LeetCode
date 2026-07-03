//40. 组合总和 II
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
public:
	void backtracking(vector<int>& candidates,int target,int sum,int index){
		if(sum==target){
			res.push_back(vector<int>(path));
			return;
		}
		for(int i=index;i<candidates.size()&&sum+candidates[i]<=target;i++){
			if(i>index&&candidates[i]==candidates[i-1]) continue;
			path.push_back(candidates[i]);
			backtracking(candidates,target,sum+candidates[i],i+1);
			path.pop_back();
		}
	}
	vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
		sort(candidates.begin(),candidates.end());
		backtracking(candidates,target,0,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
