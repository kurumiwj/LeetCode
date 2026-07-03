//13. 镂空三角形
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

function printSpace(n){
  for(let i=0;i<n;i++) process.stdout.write(" ");
}

function printLine(x,n){
  let res=x.toString();
  for(let i=0;i<n-2;i++) res+=" ";
  res+=x;
  console.log(res);
}

async function main(){
  while(line=await readline()){
    if(line[0]=="@") break;
    let [x,n]=line.split(" ");
    n=parseInt(n);
    if(x=="@") break;
    for(let i=1;i<=n;i++){
      printSpace(n-i);
      if(i==1||i==n){
        for(let j=1;j<=2*i-1;j++) process.stdout.write(x);
        console.log();
      }
      else printLine(x,2*i-1);
    }
    console.log();
  }
}

main();