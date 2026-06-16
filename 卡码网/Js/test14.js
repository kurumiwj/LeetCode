//14. 句子缩写
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  const n=parseInt(await readline());
  for(let i=0;i<n;i++){
    let line=await readline();
    let words=line.split(/\s+/);
    words.forEach(item=>{process.stdout.write(item.toUpperCase().charAt(0))});
    console.log();
  }
}

main();