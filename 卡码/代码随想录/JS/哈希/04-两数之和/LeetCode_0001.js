//1. 两数之和
const twoSum=(nums,target)=>{
  let map=new Map();
  for(let index in nums){
    if(map.has(target-nums[index])){
      console.log(map);
      return [index,map.get(target-nums[index])];
    }
    else map.set(nums[index],index);
  }
  return [];
}