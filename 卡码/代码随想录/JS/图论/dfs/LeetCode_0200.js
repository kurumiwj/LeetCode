//200. 岛屿数量
const numIslands = function(grid) {
  const dir=[[0,1],[1,0],[0,-1],[-1,0]];
	let res=0;
	const n=grid.length;
	const m=grid[0].length;
	const dfs=(x,y)=>{
		grid[x][y]="0";
		for(let i=0;i<4;i++){
			const nextX=x+dir[i][0];
			const nextY=y+dir[i][1];
			if(nextX<0||nextX>=n||nextY<0||nextY>=m) continue;
			if(grid[nextX][nextY]=="1") dfs(nextX,nextY);
		}
	}
	for(let i=0;i<n;i++){
		for(let j=0;j<m;j++){
			if(grid[i][j]=="1"){
				res++;
				dfs(i,j);
			}
		}
	}
	return res;
};
