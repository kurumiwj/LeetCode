//684. 冗余连接
#include <iostream>
#include <vector>
using namespace std;

class Solution {
private:
	vector<int> father;
	void init(int n){
		for(int i=0;i<=n;i++) father[i]=i;
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
public:
	vector<int> findRedundantConnection(vector<vector<int>>& edges) {
		int n=edges.size();
		father.resize(n+1,0);
		init(n);
		vector<int> res={};
		for(vector<int> edge:edges){
			if(isSame(edge[0],edge[1])) res=edge;
			else join(edge[0],edge[1]);
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
