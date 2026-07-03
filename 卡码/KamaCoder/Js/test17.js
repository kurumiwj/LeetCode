//17. 出栈合法性
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const n=parseInt(line);
    if(n===0) break;
    const nums=(await readline()).split(" ").map(Number);
    let stack=new Array(0);
    let index=0
    for(let i=1;i<=n;i++){
      stack.push(i);
      while(stack.length!==0&&stack[stack.length-1]==nums[index]){
        stack.pop();
        index++;
      }
    }
    if(stack.length===0&&index===n) console.log("Yes");
    else console.log("No");
  }
}

main();