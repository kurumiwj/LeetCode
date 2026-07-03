//46. 携带研究材料
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

(async function(){
	const [m,n]=(await readline()).split(" ").map(Number);
	const weight=(await readline()).split(" ").map(Number);
	const value=(await readline()).split(" ").map(Number);
	const dp=new Array(n+1).fill(0);
	for(let i=0;i<m;i++){
		for(let j=n;j>=weight[i];j--){
			dp[j]=Math.max(dp[j],dp[j-weight[i]]+value[i]);
		}
	}
	console.log(dp[n]);
})();