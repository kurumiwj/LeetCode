//70. 爬楼梯
#include <iostream>
using namespace std;

class Solution {
public:
	int climbStairs(int n) {
		if(n<=1) return n;
		int dp[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<n+1;i++) dp[i]=dp[i-1]+dp[i-2];
		return dp[n];
	}
};

int main(){
  system("pause");
  return 0;
}
