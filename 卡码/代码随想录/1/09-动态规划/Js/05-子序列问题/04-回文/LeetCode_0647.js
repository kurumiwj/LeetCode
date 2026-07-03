//647. 回文子串
//动态规划
const countSubstrings = function(s) {
	const n=s.length;
	let res=0;
	const dp=new Array(n).fill(0).map(item=>new Array(n).fill(false));
	for(let i=n-1;i>=0;i--){
		for(let j=i;j<n;j++){
			if(s[i]==s[j]&&(j-i<=1||dp[i+1][j-1])){
				dp[i][j]=true;
				res++;
			}
		}
	}
	return res;
};

//双指针
const countSubstrings1 = function(s) {
	let res=0;
	for(let i=0;i<s.length;i++){
		res+=countPalindrome(s,i,i);
		res+=countPalindrome(s,i,i+1);
	}
	return res;
};
const countPalindrome=function(s,i,j){
	let res=0;
	while(i>=0&&j<s.length&&s[i]==s[j]){
		i--;
		j++;
		res++;
	}
	return res;
}
