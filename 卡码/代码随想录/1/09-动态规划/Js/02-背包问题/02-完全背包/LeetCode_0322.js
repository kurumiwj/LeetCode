//322. 零钱兑换
const coinChange = function(coins, amount) {
	const dp=new Array(amount+1).fill(Number.MAX_VALUE-1);
	dp[0]=0;
	for(let coin of coins){
		for(let j=coin;j<=amount;j++){
			dp[j]=Math.min(dp[j],dp[j-coin]+1);
		}
	}
	return dp[amount]==Number.MAX_VALUE-1 ? -1 : dp[amount];
};