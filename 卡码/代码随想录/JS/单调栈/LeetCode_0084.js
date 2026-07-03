//84. 柱状图中最大的矩形
const largestRectangleArea = function(heights) {
	heights.unshift(0);
	heights.push(0);
	const st=new Array();
	let res=0;
	st.push(0);
	for(let i=1;i<heights.length;i++){
		if(heights[i]==heights[st[st.length-1]]) st.pop();
		else{
			while(heights[i]<heights[st[st.length-1]]){
				const mid=st.pop();
				if(st.length){
					const h=heights[mid];
					const w=i-st[st.length-1]-1;
					res=Math.max(res,h*w);
				}
			}
		}
		st.push(i);
	}
	return res;
};
