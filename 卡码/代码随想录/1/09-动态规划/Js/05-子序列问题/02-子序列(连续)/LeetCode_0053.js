//53. 最大子数组和
const maxSubArray = function(nums) {
  const dp=new Array(nums.length).fill(0);
	let res=nums[0];
	dp[0]=nums[0];
	for(let i=1;i<nums.length;i++){
		dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
		res=dp[i]>res?dp[i]:res;
	}
	return res;
};
