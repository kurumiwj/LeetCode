//20. 删除重复元素
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

async function main(){
  while(line=await readline()){
    const nums=line.trim().split(" ").map(Number);
    if(nums[0]===0){
      console.log("list is empty");
      continue;
    }
    let res="";
    for(let i=1;i<=nums[0];i++){
      if(i!=1) res+=" ";
      res+=nums[i];
    }
    console.log(res);
    res="";
    let numsUnique=Array.from(new Set(nums.slice(1)));
    numsUnique.forEach((item,index)=>{
      if(index!=0) res+=" ";
      res+=item;
    });
    console.log(res);
  }
}

main();