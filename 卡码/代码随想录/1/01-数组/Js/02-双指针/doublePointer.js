//27. 移除元素
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const removeElement = (nums, val)=> {
  let slow=0;
  for(let fast=0;fast<nums.length;fast++){
    if(nums[fast]!==val) nums[slow++]=nums[fast];
  }
  return slow;
};

async function main(){
  const nums=[0,1,2,2,3,0,4,2];
  console.log(removeElement(nums,2));
}

main();