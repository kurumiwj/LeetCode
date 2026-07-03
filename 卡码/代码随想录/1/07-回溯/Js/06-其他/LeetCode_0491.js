//491. 非递减子序列
const findSubsequences = function(nums) {
  const res=new Array();
  const path=new Array();
  const backtracking=function(nums,index){
    if(path.length>1) res.push(Array.from(path));
    const hash=new Array(201).fill(false);
    for(let i=index;i<nums.length;i++){
      if(path.length>0&&nums[i]<path[path.length-1]||hash[nums[i]+100]) continue;
      hash[nums[i]+100]=true;
      path.push(nums[i]);
      backtracking(nums,i+1);
      path.pop();
    }
  }
  backtracking(nums,0);
  return res;
};