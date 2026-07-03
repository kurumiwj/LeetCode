//746. 使用最小花费爬楼梯
#include <iostream>
#include <algorithm>
using namespace std;

class Solution {
public:
	int minCostClimbingStairs(vector<int>& cost) {
		int dp[cost.size()+1];
		dp[0]=0,dp[1]=0;
		for(int i=2;i<=cost.size();i++){
			dp[i]=min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
		}
		return dp[cost.size()];
	}
};

int main(){
  system("pause");
  return 0;
}
