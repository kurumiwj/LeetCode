//503. 下一个更大元素 II
const nextGreaterElements = function(nums) {
	const res=new Array(nums.length).fill(-1);
	const st=new Array();
	for(let i=0;i<nums.length*2;i++){
		while(st.length&&nums[i%nums.length]>nums[st[st.length-1]]){
			res[st[st.length-1]]=nums[i%nums.length]
			st.pop();
		}
		st.push(i%nums.length);
	}
	return res;
};
