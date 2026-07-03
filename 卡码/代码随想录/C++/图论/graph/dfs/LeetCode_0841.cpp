//841. 钥匙和房间
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
	vector<bool> visited;
public:
	void dfs(vector<vector<int>>& rooms,int key){
		if(visited[key]) return;
		visited[key]=true;
		vector<int> keys=rooms[key];
		for(int key:keys){
			dfs(rooms,key);
		}
	}
	bool canVisitAllRooms(vector<vector<int>>& rooms) {
		visited.resize(rooms.size(),false);
		dfs(rooms,0);
		return count(visited.begin(),visited.end(),false)==0;
	}
};

int main(){
  system("pause");
  return 0;
}
