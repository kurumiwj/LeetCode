//2. A+B问题II
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    let n=parseInt(line);
    for(let i=0;i<n;i++){
      const [a,b]=(await readline()).split(" ").map(Number);
      console.log(a+b);
    }
  }
}

main();