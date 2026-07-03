//12. 打印数字图形
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

function printLine(n){
  let res=""
  for(let i=1;i<=n;i++) res+=i;
  for(let i=n-1;i>=1;i--) res+=i;
  console.log(res);
}

function printSpace(n){
  for(let i=0;i<n;i++) process.stdout.write(" ");
}

async function main(){
  while(line=await readline()){
    const n=parseInt(line);
    for(let i=1;i<=n;i++){
      printSpace(n-i);
      printLine(i);
    }
    for(let i=n-1;i>=1;i--){
      printSpace(n-i);
      printLine(i);
    }
  }
}

main();