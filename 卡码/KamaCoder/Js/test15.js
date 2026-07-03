//15. 神秘字符
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

function merge(str1,str2){
  const middle=Math.floor(str1.length/2);
  return str1.slice(0,middle)+str2+str1.slice(middle);
}

async function main(){
  const n=parseInt(await readline());
  for(let i=0;i<n;i++){
    let str1=await readline();
    let str2=await readline();
    console.log(merge(str1,str2));
  }
}

main();