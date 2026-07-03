//452. 用最少数量的箭引爆气球
const findMinArrowShots = function(points) {
	if(points.length==0) return 0;
	points.sort((p1,p2)=>p1[0]-p2[0]);
	let arrow=1;
	for(let i=1;i<points.length;i++){
		if(points[i][0]>points[i-1][1]) arrow++;
		else points[i][1]=Math.min(points[i][1],points[i-1][1]);
	}
	return arrow;
};