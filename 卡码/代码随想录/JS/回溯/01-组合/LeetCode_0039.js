//39. 组合总和
const combinationSum = function(candidates, target) {
  const res=new Array();
  const path=new Array();
  const backtracking=(candidates,target,sum,index)=>{
    if(sum>target) return;
    if(sum==target){
      res.push(Array.from(path));
      return;
    }
    for(let i=index;i<candidates.length&&sum+candidates[i]<=target;i++){
      path.push(candidates[i]);
      backtracking(candidates,target,sum+candidates[i],i);
      path.pop();
    }
  }
  candidates.sort((a,b)=>a-b);
  backtracking(candidates,target,0,0);
  return res;
};