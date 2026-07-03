//11. 共同祖先
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const n=parseInt(line);
    let commons=new Array(21).fill(0);
    for(let i=0;i<n;i++){
      const [a,b]=(await readline()).split(" ").map(Number);
      commons[a]=b;
    }
    let height1=0,height2=0;
    let start1=1,start2=2;
    while(commons[start1]!=0){
      height1++;
      start1=commons[start1];
    }
    while(commons[start2]!=0){
      height2++;
      start2=commons[start2];
    }
    if(height1>height2) console.log("You are my elder");
    else if(height1<height2) console.log("You are my younger");
    else console.log("You are my brother");
  }
}

main();