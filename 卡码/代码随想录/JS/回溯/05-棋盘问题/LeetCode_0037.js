//37. 解数独
const solveSudoku = function(board) {
  const isValid=function(row,col,ch){
    for(let i=0;i<9;i++)
      if(board[row][i]==ch||board[i][col]==ch) return false;
    let startRow=Math.floor(row/3)*3,startCol=Math.floor(col/3)*3;
    for(let i=startRow;i<startRow+3;i++)
      for(let j=startCol;j<startCol+3;j++)
        if(board[i][j]==ch) return false;
    return true;
  }
  const backtracking=function(){
    for(let i=0;i<9;i++){
      for(let j=0;j<9;j++){
        if(board[i][j]=="."){
          for(let k=1;k<=9;k++)
            if(isValid(i,j,k)){
              board[i][j]=k.toString();
              if(backtracking()) return true;
              board[i][j]=".";
            }
          return false;
        }
      }
    }
    return true;
  }
  backtracking();
};