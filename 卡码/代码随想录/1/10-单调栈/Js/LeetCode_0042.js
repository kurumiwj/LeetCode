//42. 接雨水
const trap = function(height) {
	const st=new Array();
	if(height.length<3) return 0;
	let res=0;
	for(let i=0;i<height.length;i++){
		while(st.length&&height[i]>height[st[st.length-1]]){
			let low=st.pop();
			if(st.length){
				let h=Math.min(height[i],height[st[st.length-1]])-height[low];
				let w=i-st[st.length-1]-1;
				res+=h*w;
			}
		}
		st.push(i);
	}
	return res;
};
