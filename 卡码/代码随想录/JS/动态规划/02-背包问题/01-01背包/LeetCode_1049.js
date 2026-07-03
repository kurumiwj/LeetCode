//1049. 最后一块石头的重量 II
const lastStoneWeightII = function(stones) {
	const sum=stones.reduce((prev,cur)=>prev+cur,0);
	const target=Math.floor(sum/2);
	const dp=new Array(1501).fill(0);
	for(let i=0;i<stones.length;i++){
		for(let j=target;j>=stones[i];j--){
			dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
		}
	}
	return sum-2*dp[target];
};