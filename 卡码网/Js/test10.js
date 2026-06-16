//10. 运营商活动
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    let [m,k]=line.split(" ").map(Number);
    if(m==0&&k==0) break;
    let total=m;
    while(m>=k){
      let left=Math.floor(m/k);
      total+=left;
      m=left+m%k;
    }
    console.log(total);
  }
}

main();