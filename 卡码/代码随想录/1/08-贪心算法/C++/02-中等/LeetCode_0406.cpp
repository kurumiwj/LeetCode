//406. 根据身高重建队列
#include <iostream>
#include <vector>
#include <list>
#include <algorithm>
using namespace std;

class Solution {
public:
  vector<vector<int>> reconstructQueue(vector<vector<int>>& people) {
  	sort(people.begin(),people.end(),[](vector<int>& p1,vector<int>& p2){
			if(p1[0]==p2[0]) return p1[1]<p2[1];
			else return p1[0]>p2[0];
		});
		list<vector<int>> q;
		for(vector<int>& p:people){
			int pos=p[1];
			auto it=q.begin();
			while(pos--) it++;
			q.insert(it,p);
		}
		return vector<vector<int>>(q.begin(),q.end());
  }
};

int main(){
  system("pause");
  return 0;
}
