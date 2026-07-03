//216. 组合总和 III
const combinationSum3 = function(k, n) {
  const path=new Array();
  const res=new Array();
  const backtracking=(k,n,sum,index)=>{
    if(sum>n) return;
    if(k==path.length){
      if(sum==n) res.push(Array.from(path));
      return;
    }
    for(let i=index;i<=10-(k-path.length);i++){
      path.push(i);
      backtracking(k,n,sum+i,i+1);
      path.pop();
    }
  }
  backtracking(k,n,0,1);
  return res;
};