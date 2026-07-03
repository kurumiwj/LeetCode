//797. 所有可能的路径
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	vector<vector<int>> res;
	vector<int> path;
public:
	void dfs(vector<vector<int>>& graph,int index){
		if(index==graph.size()-1){
			res.push_back(path);
			return;
		}
		for(int i=0;i<graph[index].size();i++){
			path.push_back(graph[index][i]);
			dfs(graph,graph[index][i]);
			path.pop_back();
		}
	}
	vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
		path.push_back(0);
		dfs(graph,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
