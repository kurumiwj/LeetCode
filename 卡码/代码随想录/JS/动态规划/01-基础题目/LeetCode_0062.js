//62. 不同路径
const uniquePaths = function(m, n) {
	const dp=new Array(m).fill(new Array(n));
	for(let i=0;i<m;i++) dp[i][0]=1;
	for(let j=0;j<n;j++) dp[0][j]=1;
	for(let i=1;i<m;i++)
		for(let j=1;j<n;j++)
			dp[i][j]=dp[i-1][j]+dp[i][j-1];
	return dp[m-1][n-1];
};