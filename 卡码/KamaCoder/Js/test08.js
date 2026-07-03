//8. 摆平积木
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const n=parseInt(line);
    if(n===0) break;
    const nums=(await readline()).split(" ").map(Number);
    const total=nums.reduce((item,pre)=>item+pre,0);
    const avg=total/n;
    let res=0;
    nums.forEach(item=>{
      if(item>avg) res+=item-avg;
    });
    console.log(res);
    console.log();
  }
}

main();