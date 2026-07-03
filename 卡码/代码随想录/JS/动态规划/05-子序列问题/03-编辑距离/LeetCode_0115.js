//115. 不同的子序列
const numDistinct = function(s, t) {
	const dp=new Array(s.length+1);
	for(let i=0;i<s.length+1;i++){
		dp[i]=new Array(t.length+1).fill(0);
		dp[i][0]=1;
	}
	for(let i=1;i<s.length+1;i++){
		for(let j=1;j<t.length+1;j++){
			if(s[i-1]==t[j-1]) dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
			else dp[i][j]=dp[i-1][j];
		}
	}
	return dp[s.length][t.length];
};
