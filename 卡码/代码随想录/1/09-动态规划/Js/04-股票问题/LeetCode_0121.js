//121. 买卖股票的最佳时机
const maxProfit = function(prices) {
	const dp=[prices[0],0];
	for(let i=1;i<=prices.length;i++){
		dp[0]=Math.min(dp[0],prices[i-1]);
		dp[1]=Math.max(dp[1],prices[i-1]-dp[0]);
	}
	return dp[1];
};
