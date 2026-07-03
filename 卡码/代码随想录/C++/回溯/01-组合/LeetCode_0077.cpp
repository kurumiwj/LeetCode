//77. 组合
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	vector<int> path;
	vector<vector<int>> res;
public:
	void backtracking(int n,int k,int index){
		if(k==path.size()){
			res.push_back(path);
			return;
		}
		for(int i=index;i<=n+1-(k-path.size());i++){
			path.push_back(i);
			backtracking(n,k,i+1);
			path.pop_back();
		}
	}
	vector<vector<int>> combine(int n, int k) {
		backtracking(n,k,1);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
