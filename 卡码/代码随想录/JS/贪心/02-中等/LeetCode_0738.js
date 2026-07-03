//738. 单调递增的数字
const monotoneIncreasingDigits = function(n) {
	let nums=n.toString().split("");
	let start=nums.length;
	for(let i=nums.length-1;i>0;i--){
		if(nums[i-1]>nums[i]){
			nums[i-1]--;
			start=i;
		}
	}
	for(let i=start;i<nums.length;i++) nums[i]=9;
	return nums.join("");
};