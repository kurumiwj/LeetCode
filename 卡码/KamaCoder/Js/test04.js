//4. A+B问题IV
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const [n,...nums]=line.split(" ").map(Number);
    if(n===0) break;
    console.log(nums.reduce((item,prev)=>item+prev,0));
  }
}

main();