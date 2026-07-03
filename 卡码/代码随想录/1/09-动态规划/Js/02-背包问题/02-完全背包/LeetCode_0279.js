//279. 完全平方数
const numSquares = function(n) {
	const dp=new Array(n+1).fill(Number.MAX_VALUE-1);
	dp[0]=0;
	for(let i=1;i*i<=n;i++){
		for(let j=i*i;j<=n;j++){
			dp[j]=Math.min(dp[j],dp[j-i*i]+1);
		}
	}
	return dp[n];
};