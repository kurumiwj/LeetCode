//509. 斐波那契数
const fib = function(n) {
	if(n<=1) return n;
	const dp=new Array(n+1);
	dp[0]=0,dp[1]=1;
	for(let i=2;i<n+1;i++) dp[i]=dp[i-1]+dp[i-2];
	return dp[n];
};