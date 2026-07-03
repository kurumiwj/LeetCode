//57. 爬楼梯
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

(async function(){
	const [n,m]=(await readline()).split(" ").map(Number);
	const dp=new Array(n+1).fill(0);
	dp[0]=1;
	for(let i=1;i<=n;i++){
		for(let j=1;j<=m;j++){
			if(i>=j) dp[i]+=dp[i-j];
			else break;
		}
	}
	console.log(dp[n]);
})();