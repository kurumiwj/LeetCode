//16. 位置互换
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

function reverse(str){
  let res="";
  for(let i=0;i<str.length;i+=2){
    res+=str[i+1]+str[i];
  }
  return res;
}

async function main(){
  let n=parseInt(await readline());
  for(let i=0;i<n;i++){
    let str=await readline();
    console.log(reverse(str));
  }
}

main();