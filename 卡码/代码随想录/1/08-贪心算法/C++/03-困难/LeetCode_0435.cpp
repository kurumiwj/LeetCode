//435. 无重叠区间
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
	int eraseOverlapIntervals(vector<vector<int>>& intervals) {
		if(intervals.size()==0) return 0;
		sort(intervals.begin(),intervals.end(),[](vector<int>& a,vector<int>& b){
			return a[0]<b[0];
		});
		int res=0;
		for(int i=1;i<intervals.size();i++){
			if(intervals[i][0]<intervals[i-1][1]){
				res++;
				intervals[i][1]=min(intervals[i][1],intervals[i-1][1]);
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
