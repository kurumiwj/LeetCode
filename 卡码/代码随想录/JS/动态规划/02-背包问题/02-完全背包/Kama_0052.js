//52. 携带研究材料
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

(async function(){
	const [n,v]=(await readline()).split(" ").map(Number);
	const weight=new Array(n);
	const value=new Array(n);
	for(let i=0;i<n;i++){
		[weight[i],value[i]]=(await readline()).split(" ").map(Number);
	}
	const dp=new Array(v+1).fill(0);
	for(let i=0;i<n;i++){
		for(let j=weight[i];j<v+1;j++){
			dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
		}
	}
	console.log(dp[v]);
})();