//674. 最长连续递增序列
const findLengthOfLCIS = function(nums) {
	const dp=new Array(nums.length).fill(1);
	let res=1;
	for(let i=1;i<nums.length;i++){
		if(nums[i]>nums[i-1]){
			dp[i]=dp[i-1]+1;
			res=res>dp[i]?res:dp[i];
		}
	}
	return res;
};
