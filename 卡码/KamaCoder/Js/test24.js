//24. 最长公共子序列
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

void async function(){
  let line;
  while((line=await readline())){
    const [s1,s2]=line.split(" ");
    let dp=new Array(s1.length+1);
    for(let i=0;i<s1.length+1;i++){
      dp[i]=new Array(s2.length+1).fill(0);
    }
    for(let i=1;i<s1.length+1;i++){
      for(let j=1;j<s2.length+1;j++){
        if(s1[i-1]==s2[j-1]) dp[i][j]=dp[i-1][j-1]+1;
        else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
      }
    }
    console.log(dp[s1.length][s2.length]);
  }
}();