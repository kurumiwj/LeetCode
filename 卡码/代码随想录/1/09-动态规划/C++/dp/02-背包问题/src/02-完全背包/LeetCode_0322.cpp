//322. 零钱兑换
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int coinChange(vector<int>& coins, int amount) {
		vector<int> dp(amount+1,INT_MAX-2);
		dp[0]=0;
		for(int coin:coins){
			for(int j=coin;j<=amount;j++){
				dp[j]=min(dp[j],dp[j-coin]+1);
			}
		}
		if(dp[amount]==INT_MAX-1) return -1;
		return dp[amount];
	}
};

int main(){
  system("pause");
  return 0;
}
