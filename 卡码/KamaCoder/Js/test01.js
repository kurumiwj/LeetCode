const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const [a,b]=line.split(" ").map(Number);
    console.log(a+b);
  }
}

main();