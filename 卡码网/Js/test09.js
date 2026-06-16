//9. 奇怪的信
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const nums=line.split("").map(Number);
    let res=0;
    nums.forEach(num=>{
      if(num%2==0) res+=num;
    });
    console.log(res);
    console.log();
  }
}

main();