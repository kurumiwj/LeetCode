//714. 买卖股票的最佳时机含手续费
const maxProfit = function(prices, fee) {
	const dp=[-prices[0],0];
	for(let i=1;i<prices.length;i++){
		dp[0]=Math.max(dp[0],dp[1]-prices[i]);
		dp[1]=Math.max(dp[1],dp[0]+prices[i]-fee);
	}
	return dp[1];
};
