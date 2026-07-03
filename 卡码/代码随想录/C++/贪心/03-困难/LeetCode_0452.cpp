//452. 用最少数量的箭引爆气球
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
	int findMinArrowShots(vector<vector<int>>& points) {
		if(points.empty()) return 0;
		sort(points.begin(),points.end(),[](vector<int>& p1,vector<int>& p2){
			return p1[0]<p2[0];
		});
		int arrow=1;
		for(int i=1;i<points.size();i++){
			if(points[i][0]>points[i-1][1]) arrow++;
			else points[i][1]=min(points[i-1][1],points[i][1]);
		}
		return arrow;
	}
};

int main(){
  system("pause");
  return 0;
}
