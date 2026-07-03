//63. 不同路径 II
const uniquePathsWithObstacles = function(obstacleGrid) {
	const m=obstacleGrid.length;
	const n=obstacleGrid[0].length;
	if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1) return 0;
	const dp=new Array(m).fill().map(item=>new Array(n).fill(0));
	for(let i=0;i<m&&obstacleGrid[i][0]==0;i++) dp[i][0]=1;
	for(let j=0;j<n&&obstacleGrid[0][j]==0;j++) dp[0][j]=1;
	for(let i=1;i<m;i++)
		for(let j=1;j<n;j++)
			if(obstacleGrid[i][j]==0) dp[i][j]=dp[i-1][j]+dp[i][j-1];
	return dp[m-1][n-1];
};