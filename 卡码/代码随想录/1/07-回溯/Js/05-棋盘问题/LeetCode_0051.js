//51. N 皇后
const solveNQueens = function(n) {
  const res=new Array();
  const chess=new Array(n).fill([]).map(()=>new Array(n).fill("."));
  const tmp=new Array(n);
  const isValid=function(row,col){
    for(let i=0;i<row;i++)
      if(chess[i][col]=="Q") return false;
    for(let i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
      if(chess[i][j]=="Q") return false;
    for(let i=row-1,j=col+1;i>=0&&j<n;i--,j++)
      if(chess[i][j]=="Q") return false;
    return true;
  }
  const backtracking=function(row){
    if(row==n){
      chess.forEach((item,index)=>{
        tmp[index]=item.join("");
      });
      res.push(Array.from(tmp));
      return;
    }
    for(let col=0;col<n;col++){
      if(isValid(row,col)){
        chess[row][col]="Q";
        backtracking(row+1);
        chess[row][col]=".";
      }
    }
  }
  backtracking(0);
  return res;
};