//406. 根据身高重建队列
const reconstructQueue = function(people) {
	const q=new Array();
	people.sort((p1,p2)=>{
		if(p1[0]==p2[0]) return p1[1]-p2[1];
		else return p2[0]-p1[0];
	});
	for(let p of people){
		q.splice(p[1],0,p);
	}
	return q;
};