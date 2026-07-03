//56. 合并区间
const merge = function(intervals) {
	const res=new Array();
	intervals.sort((a,b)=>a[0]-b[0]);
	res.push(intervals[0]);
	for(let i=1;i<intervals.length;i++){
		if(intervals[i][0]<=res[res.length-1][1]){
			res[res.length-1][1]=Math.max(intervals[i][1],res[res.length-1][1]);
		}else{
			res.push(intervals[i]);
		}
	}
	return res;
};