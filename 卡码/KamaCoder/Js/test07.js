//7. 平均绩点
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  let scores="FDCBA";
  while(line=await readline()){
    const grades=line.split(" ");
    let total=0;
    let flag=false;  //标记是否有奇怪的等级
    for(let i of grades){
      let index=scores.indexOf(i);
      if(index===-1){
        flag=true;
        break
      }
      total+=index;
    }
    if(flag) console.log("Unknown");
    else console.log((total/grades.length).toFixed(2));
  }
}

main();