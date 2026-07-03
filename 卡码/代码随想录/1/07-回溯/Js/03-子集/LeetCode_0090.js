//90. 子集 II
const subsetsWithDup = function(nums) {
  const res=new Array();
  const path=new Array();
  const backtracking=function(nums,index){
    res.push(Array.from(path));
    for(let i=index;i<nums.length;i++){
      if(i>index&&nums[i]==nums[i-1]) continue;
      path.push(nums[i]);
      backtracking(nums,i+1);
      path.pop();
    }
  }
  nums.sort((a,b)=>a-b);
  backtracking(nums,0);
  return res;
};