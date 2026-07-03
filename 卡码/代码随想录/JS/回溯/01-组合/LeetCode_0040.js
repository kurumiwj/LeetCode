//40. 组合总和 II
const combinationSum2 = function(candidates, target) {
  const res=new Array();
  const path=new Array();
  const backtracking=(candidates,target,sum,index)=>{
    if(sum==target){
      res.push(Array.from(path));
      return;
    }
    for(let i=index;i<candidates.length&&sum+candidates[i]<=target;i++){
      if(i>index&&candidates[i]==candidates[i-1]) continue;
      path.push(candidates[i]);
      backtracking(candidates,target,sum+candidates[i],i+1)
      path.pop();
    }
  }
  candidates.sort((a,b)=>a-b);
  backtracking(candidates,target,0,0);
  return res;
};