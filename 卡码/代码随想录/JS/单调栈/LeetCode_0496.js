//496. 下一个更大元素 I
const nextGreaterElement = function(nums1, nums2) {
	const res=new Array(nums1.length).fill(-1);
	const st=new Array();
	const hash=new Map();
	for(let i=0;i<nums1.length;i++) hash.set(nums1[i],i);
	for(let i=0;i<nums2.length;i++){
		while(st.length&&nums2[i]>nums2[st[st.length-1]]){
			if(hash.has(nums2[st[st.length-1]])) res[hash.get(nums2[st[st.length-1]])]=nums2[i];
			st.pop();
		}
		st.push(i);
	}
	return res;
};
