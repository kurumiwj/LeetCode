//463. 岛屿的周长
const islandPerimeter = function(grid) {
  const dir=[[0,1],[1,0],[0,-1],[-1,0]];
  const n=grid.length,m=grid[0].length;
  let res=0;
  for(let i=0;i<n;i++){
    for(let j=0;j<m;j++){
      if(grid[i][j]==1){
        for(let k=0;k<4;k++){
          const x=i+dir[k][0];
          const y=j+dir[k][1];
          if(x<0||x>n-1||y<0||y>m-1||grid[x][y]==0) res++;
        }
      }
    }
  }
  return res;
};
