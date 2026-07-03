//435. 无重叠区间
const eraseOverlapIntervals = function(intervals) {
	if(intervals.length==0) return 0;
	intervals.sort((a,b)=>a[0]-b[0]);
	let res=0;
	for(let i=1;i<intervals.length;i++){
		if(intervals[i][0]<intervals[i-1][1]){
			res++;
			intervals[i][1]=Math.min(intervals[i][1],intervals[i-1][1])
		}
	}
	return res;
};