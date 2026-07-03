//213. 打家劫舍 II
const rob0 = function(nums,start,end) {
	if(end-start==1) return nums[start];
	const dp=new Array(nums.length).fill(0);
	dp[start]=nums[start];
	if(end-start>1) dp[start+1]=Math.max(nums[start],nums[start+1]);
	for(let i=start+2;i<end;i++){
		dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
	}
	return dp[end-1];
};

const rob = function(nums) {
	if(nums.length==1) return nums[0];
	return Math.max(rob0(nums,0,nums.length-1),rob0(nums,1,nums.length));
};