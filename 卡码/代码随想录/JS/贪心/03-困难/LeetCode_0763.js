//763. 划分字母区间
const partitionLabels = function(s) {
	const hash=new Array(30);
	const res=new Array();
	let left=0,right=0;
	for(let i=0;i<s.length;i++){
		hash[s.charCodeAt(i)-'a'.charCodeAt(0)]=i;
	}
	for(let i=0;i<s.length;i++){
		right=Math.max(right,hash[s.charCodeAt(i)-'a'.charCodeAt(0)]);
		if(i==right){
			res.push(right-left+1);
			left=i+1;
		}
	}
	return res;
};