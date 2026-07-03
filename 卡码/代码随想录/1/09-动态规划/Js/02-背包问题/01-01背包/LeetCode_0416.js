//416. 分割等和子集
const canPartition = function(nums) {
	let sum=0;
	for(let num of nums) sum+=num;
	if(sum%2==1) return false;
	const target=Math.floor(sum/2);
	const dp=new Array(10001).fill(0);
	for(let i=0;i<nums.length;i++){
		for(let j=target;j>=nums[i];j--){
			dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
		}
	}
	if(target==dp[target]) return true;
	return false;
};