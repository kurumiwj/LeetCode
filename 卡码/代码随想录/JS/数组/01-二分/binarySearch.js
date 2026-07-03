const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const search = (nums, target)=>{
  let left=0,right=nums.length-1;
  while(left<=right){
    let middle=Math.floor((left+right)/2);
    if(nums[middle]===target) return middle;
    else if(target<nums[middle]) right=middle-1;
    else left=middle+1;
  }
  return -1;
};

async function main(){
  const nums=[-1,0,3,5,9,12];
  console.log(search(nums,9));
  console.log(search(nums,2));
  console.log(search(nums,13));
}

main();