//6. A+B问题VIII
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const n=parseInt(line);
    for(let i=0;i<n;i++){
      let sum=0;
      const [m,...nums]=(await readline()).split(" ").map(Number);
      console.log(nums.reduce((item,prev)=>item+prev,0));
      if(i!=n-1) console.log();
    }
  }
}

main();