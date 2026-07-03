//135. 分发糖果
const candy = function(ratings) {
	const can=new Array(ratings.length).fill(1);
	for(let i=1;i<ratings.length;i++)
		if(ratings[i]>ratings[i-1]) can[i]=can[i-1]+1;
	for(let i=ratings.length-2;i>=0;i--)
		if(ratings[i]>ratings[i+1]) can[i]=Math.max(can[i+1]+1,can[i]);
	let sum=0;
	for(let val of can) sum+=val;
	return sum;
};