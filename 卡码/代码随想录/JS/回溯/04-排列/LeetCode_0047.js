//47. 全排列 II
const permuteUnique = function(nums) {
  const res=new Array();
  const path=new Array();
  const visited=new Array(nums.length).fill(false);
  const backtracking=function(nums){
    if(path.length==nums.length){
      res.push(Array.from(path));
      return;
    }
    for(let i=0;i<nums.length;i++){
      if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]||visited[i]) continue;
      visited[i]=true;
      path.push(nums[i]);
      backtracking(nums);
      path.pop();
      visited[i]=false;
    }
  }
  nums.sort((a,b)=>a-b);
  backtracking(nums);
  return res;
};