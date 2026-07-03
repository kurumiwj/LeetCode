//46. 全排列
const permute = function(nums) {
  const res=new Array();
  const path=new Array();
  const visited=new Array(nums.length).fill(false);
  const backtracking=function(nums){
    if(path.length==nums.length){
      res.push(Array.from(path));
      return;
    }
    for(let i=0;i<nums.length;i++){
      if(visited[i]) continue;
      path.push(nums[i]);
      visited[i]=true;
      backtracking(nums);
      visited[i]=false;
      path.pop();
    }
  };
  backtracking(nums);
  return res;
};