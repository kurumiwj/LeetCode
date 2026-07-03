//46. 携带研究材料
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

(async function(){
	const [m,n]=(await readline()).split(" ").map(Number);
	const weight=(await readline()).split(" ").map(Number);
	const value=(await readline()).split(" ").map(Number);
	const dp=new Array(m).fill(0).map(item=>new Array(n+1).fill(0));
	for(let j=weight[0];j<=n;j++){
		dp[0][j]=value[0];
	}
	for(let i=1;i<m;i++){
		for(let j=1;j<=n;j++){
			if(j<weight[i]){
				dp[i][j]=dp[i-1][j];
			}else{
				dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
			}
		}
	}
	console.log(dp[m-1][n]);
})();