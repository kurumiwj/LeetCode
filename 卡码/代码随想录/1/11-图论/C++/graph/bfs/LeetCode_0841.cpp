//841. 钥匙和房间
#include <iostream>
#include <queue>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
	bool bfs(vector<vector<int>>& rooms){
		vector<bool> visited(rooms.size(),false);
		queue<int> q;
		q.push(0);
		visited[0]=true;
		while(!q.empty()){
			int key=q.front();
			q.pop();
			vector<int> keys=rooms[key];
			for(int key:keys){
				if(!visited[key]){
					visited[key]=true;
					q.push(key);
				}
			}
		}
		return count(visited.begin(),visited.end(),false)==0;
	}
	bool canVisitAllRooms(vector<vector<int>>& rooms) {
		return bfs(rooms);
	}
};

int main(){
  system("pause");
  return 0;
}
