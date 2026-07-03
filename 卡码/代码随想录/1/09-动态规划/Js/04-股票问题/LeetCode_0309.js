//309. 买卖股票的最佳时机含冷冻期
const maxProfit = function(prices) {
	const dp=new Array(2).fill(0).map(item=>new Array(4).fill(0));	//持有股票，已卖出，今天卖出，冷冻期
	dp[0][0]=-prices[0];
	for(let i=1;i<prices.length;i++){
		dp[1][0]=Math.max(dp[0][0],Math.max(dp[0][1],dp[0][3])-prices[i]);
		dp[1][1]=Math.max(dp[0][1],dp[0][3])
		dp[1][2]=dp[0][0]+prices[i];
		dp[1][3]=dp[0][2];
		dp[0][0]=dp[1][0];
		dp[0][1]=dp[1][1];
		dp[0][2]=dp[1][2];
		dp[0][3]=dp[1][3];
	}
	return Math.max(dp[1][1],Math.max(dp[1][2],dp[1][3]));
};
