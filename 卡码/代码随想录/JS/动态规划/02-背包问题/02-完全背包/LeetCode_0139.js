//139. 单词拆分
const wordBreak = function(s, wordDict) {
	const dp=new Array(s.length+1).fill(false);
	dp[0]=true;
	for(let i=1;i<=s.length;i++){
		for(let j=0;j<i;j++){
			if(wordDict.includes(s.slice(j,i))&&dp[j]) dp[i]=true;
		}
	}
	return dp[s.length];
};