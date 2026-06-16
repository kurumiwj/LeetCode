//19. 单链表反转
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const out=process.stdout;

async function main(){
  while(line=await readline()){
    const nums=line.split(" ").map(Number);
    if(nums[0]===0) console.log("list is empty");
    else{
      let res="";
      for(let i=1;i<=nums[0];i++){
        if(i!=1) res+=" ";
        res+=nums[i];
      }
      console.log(res);
      res="";
      for(let i=nums[0];i>=1;i--){
        res+=nums[i];
        if(i!=1) res+=" ";
      }
      console.log(res);
    }
  }
}

main();