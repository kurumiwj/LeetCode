//209. 长度最小的子数组
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const minSubArrayLen = (target, nums)=>{
  let i=0,sum=0,res=nums.length+1;
  for(let j=0;j<nums.length;j++){
    sum+=nums[j];
    while(sum>=target){
      res=Math.min(res,j-i+1);
      sum-=nums[i];
      i++;
    }
  }
  return res==nums.length+1 ? 0 : res;
};

async function main(){
  console.log(minSubArrayLen(7,[2,3,1,2,4,3]))
}

main();
