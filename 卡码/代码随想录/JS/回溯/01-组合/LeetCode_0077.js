//77. 组合
const combine = function(n, k) {
  const res=new Array();
  const path=new Array();
  const backtracking=(n,k,index)=>{
    if(k==path.length){
      res.push(Array.from(path));
      return;
    }
    for(let i=index;i<=n+1-(k-path.length);i++){
      path.push(i);
      backtracking(n,k,i+1);
      path.pop();
    }
  }
  backtracking(n,k,1);
  return res;
};