//56. 携带矿石资源
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

(async function(){
	const [c,n]=(await readline()).split(" ").map(Number);
	const w=(await readline()).split(" ").map(Number);
	const v=(await readline()).split(" ").map(Number);
	const k=(await readline()).split(" ").map(Number);
	const dp=new Array(c+1).fill(0);
	for(let i=0;i<n;i++){
		for(let j=c;j>=w[i];j--){
			for(let l=1;l<=k[i]&&j>=l*w[i];l++){
				dp[j]=Math.max(dp[j],dp[j-l*w[i]]+l*v[i]);
			}
		}
	}
	console.log(dp[c]);
})();