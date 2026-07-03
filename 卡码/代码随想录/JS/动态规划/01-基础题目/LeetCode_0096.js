//96. 不同的二叉搜索树
const numTrees = function(n) {
	const dp=new Array(n+1).fill(0);
	dp[0]=1;
	for(let i=1;i<n+1;i++){
		for(let j=1;j<=i;j++){
			dp[i]+=dp[j-1]*dp[i-j];
		}
	}
	return dp[n];
};