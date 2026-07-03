//216. 组合总和 III
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
public:
	void backtracking(int k,int n,int sum,int index){
		if(sum>n) return;
		if(k==path.size()){
			if(sum==n) res.push_back(vector<int>(path));
			return;
		}
		for(int i=index;i<=10-(k-path.size());i++){
			path.push_back(i);
			backtracking(k,n,sum+i,i+1);
			path.pop_back();
		}
	}
	vector<vector<int>> combinationSum3(int k, int n) {
		backtracking(k,n,0,1);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
