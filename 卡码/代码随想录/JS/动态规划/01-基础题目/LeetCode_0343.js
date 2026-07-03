//343. 整数拆分
const integerBreak = function(n) {
	const dp=new Array(n+1).fill(0);
	dp[0]=0,dp[1]=0,dp[2]=1;
	for(let i=3;i<n+1;i++){
		for(let j=1;j<=Math.floor(i/2);j++){
			dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
		}
	}
	return dp[n];
};