//714. 买卖股票的最佳时机含手续费
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int maxProfit(vector<int>& prices, int fee) {
		int dp[2]={-prices[0],0};
		for(int i=1;i<prices.size();i++){
			dp[0]=max(dp[0],dp[1]-prices[i]);
			dp[1]=max(dp[1],dp[0]+prices[i]-fee);
		}
		return dp[1];
	}
};

int main(){
  system("pause");
  return 0;
}
