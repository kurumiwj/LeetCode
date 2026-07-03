//1035. 不相交的线
const maxUncrossedLines = function(nums1, nums2) {
	const dp=new Array(nums1.length+1).fill(0).map(item=>new Array(nums2.length+1).fill(0));
	for(let i=1;i<nums1.length+1;i++)
		for(let j=1;j<nums2.length+1;j++)
			if(nums1[i-1]==nums2[j-1]) dp[i][j]=dp[i-1][j-1]+1;
			else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	return dp[nums1.length][nums2.length];
};
