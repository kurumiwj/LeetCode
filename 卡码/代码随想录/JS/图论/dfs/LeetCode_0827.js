//827. 最大人工岛
const largestIsland = function(grid) {
  const dir=[[0,1],[1,0],[0,-1],[-1,0]];
  const n=grid.length,m=grid[0].length;
  let cnt=0;
  const dfs=(x,y,mark)=>{
    grid[x][y]=mark;
    cnt++;
    for(let i=0;i<4;i++){
      const nextX=x+dir[i][0];
      const nextY=y+dir[i][1];
      if(nextX<0||nextX>n-1||nextY<0||nextY>m-1) continue;
      if(grid[nextX][nextY]==0||grid[nextX][nextY]>1) continue;
      dfs(nextX,nextY,mark);
    }
  }
  let mark=2;
  let isAllLand=true;
  const areas=new Map();
  for(let i=0;i<n;i++){
    for(let j=0;j<m;j++){
      if(grid[i][j]==0) isAllLand=false;
      if(grid[i][j]==1){
        cnt=0;
        dfs(i,j,mark);
        areas.set(mark,cnt);
        mark++;
      }
    }
  }
  if(isAllLand) return n*m;
  const visited=new Set();
  let res=0;
  for(let i=0;i<n;i++){
    for(let j=0;j<m;j++){
      if(grid[i][j]==0){
        let count=1;
        visited.clear();
        for(let k=0;k<4;k++){
          const x=i+dir[k][0];
          const y=j+dir[k][1];
          if(x<0||x>n-1||y<0||y>m-1) continue;
          if(grid[x][y]>1){
            if(visited.has(grid[x][y])) continue;
            count+=areas.get(grid[x][y]);
            visited.add(grid[x][y]);
          }
        }
        res=Math.max(res,count);
      }
    }
  }
  return res;
};
