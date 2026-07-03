//309. 买卖股票的最佳时机含冷冻期
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int maxProfit(vector<int>& prices) {
		int dp[2][4]={0};	//持有股票,已卖出股票,今天卖出股票,冷冻期
		dp[0][0]=-prices[0];
		for(int i=1;i<prices.size();i++){
			dp[1][0]=max(dp[0][0],max(dp[0][3],dp[0][1])-prices[i]);
			dp[1][1]=max(dp[0][1],dp[0][3]);
			dp[1][2]=dp[0][0]+prices[i];
			dp[1][3]=dp[0][2];
			dp[0][0]=dp[1][0];
			dp[0][1]=dp[1][1];
			dp[0][2]=dp[1][2];
			dp[0][3]=dp[1][3];
		}
		return max(dp[1][1],max(dp[1][2],dp[1][3]));
	}
};

int main(){
  system("pause");
  return 0;
}
