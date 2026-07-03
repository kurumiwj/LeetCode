//977. 有序数组的平方
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const sortedSquares=nums=>{
  let res=new Array(nums.length);
  let k=res.length-1;
  for(let i=0,j=res.length-1;i<=j;){
    if(Math.pow(nums[i],2)>Math.pow(nums[j],2)) res[k--]=Number(Math.pow(nums[i++],2));
    else res[k--]=Number(Math.pow(nums[j--],2));
  }
  return res;
}

async function main(){
  const nums=[-4,-1,0,3,10];
  console.log(sortedSquares(nums));
}

main();