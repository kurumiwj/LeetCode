//474. 一和零
const findMaxForm = function(strs, m, n) {
	const dp=new Array(m+1).fill(0).map(item=>new Array(n+1).fill(0));
	for(let str of strs){
		let x=0,y=0;
		for(let ch of str){
			if(ch=="0") x++;
			else y++;
		}
		for(let i=m;i>=x;i--){
			for(let j=n;j>=y;j--){
				dp[i][j]=Math.max(dp[i][j],dp[i-x][j-y]+1);
			}
		}
	}
	return dp[m][n];
};