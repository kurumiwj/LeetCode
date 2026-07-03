//685. 冗余连接 II
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
private:
	int n;
	vector<int> father;
	void init(int n){
		for(int i=0;i<n+1;i++) father[i]=i;
	}
	int find(int u){
		return u==father[u] ? u : father[u]=find(father[u]);
	}
	bool isSame(int u,int v){
		u=find(u);
		v=find(v);
		return u==v;
	}
	void join(int u,int v){
		u=find(u);
		v=find(v);
		if(u==v) return;
		father[v]=u;
	}
	vector<int> removeEdge(const vector<vector<int>>& edges){
		init(n);
		vector<int> res={};
		for(int i=0;i<n;i++){
			if(isSame(edges[i][0],edges[i][1])) res=edges[i];
			else join(edges[i][0],edges[i][1]);
		}
		return res;
	}
	bool treeAfterRemoveEdge(const vector<vector<int>>& edges,int edge){
		init(n);
		for(int i=0;i<n;i++){
			if(i==edge) continue;
			if(isSame(edges[i][0],edges[i][1])) return false;
			join(edges[i][0],edges[i][1]);
		}
		return true;
	}
public:
	vector<int> findRedundantDirectedConnection(vector<vector<int>>& edges) {
		n=edges.size();
		father.resize(n+1,0);
		vector<int> inDegree(n+1,0);
		for_each(edges.begin(),edges.end(),[&](vector<int>& edge){
			inDegree[edge[1]]++;
		});
		vector<int> v2;	//记录入度为2的边
		for(int i=n-1;i>=0;i--){
			if(inDegree[edges[i][1]]==2) v2.push_back(i);
		}
		if(v2.size()>0){
			if(treeAfterRemoveEdge(edges,v2[0])) return edges[v2[0]];
			else return edges[v2[1]];
		}
		return removeEdge(edges);
	}
};

int main(){
  system("pause");
  return 0;
}
