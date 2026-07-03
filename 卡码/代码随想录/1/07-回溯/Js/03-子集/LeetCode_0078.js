//78. 子集
const subsets = function(nums) {
  const res=new Array();
  const path=new Array();
  const backtracking=function(nums,index){
    res.push(Array.from(path));
    if(index>=nums.length) return;
    for(let i=index;i<nums.length;i++){
      path.push(nums[i]);
      backtracking(nums,i+1);
      path.pop();
    }
  }
  backtracking(nums,0);
  return res;
};