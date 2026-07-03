//188. 买卖股票的最佳时机 IV
const maxProfit = function(k, prices) {
	const dp=new Array(2*k).fill(0);
	for(let i=0;i<2*k;i+=2) dp[i]=-prices[0];
	for(let i=1;i<prices.length;i++){
		dp[0]=Math.max(dp[0],-prices[i]);
		dp[1]=Math.max(dp[1],dp[0]+prices[i]);
		for(let j=2;j<2*k;j+=2){
			dp[j]=Math.max(dp[j],dp[j-1]-prices[i]);
			dp[j+1]=Math.max(dp[j+1],dp[j]+prices[i]);
		}
	}
	return dp[2*k-1];
};
