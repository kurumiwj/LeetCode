//494. 目标和
const findTargetSumWays = function(nums, target) {
	const sum=nums.reduce((pre,cur)=>pre+cur,0);
	if(Math.abs(target)>sum||(target+sum)%2==1) return 0;
	const n=Math.floor((target+sum)/2);
	const dp=new Array(n+1).fill(0);
	dp[0]=1;
	for(let i=0;i<nums.length;i++){
		for(let j=n;j>=nums[i];j--){
			dp[j]+=dp[j-nums[i]];
		}
	}
	return dp[n];
};