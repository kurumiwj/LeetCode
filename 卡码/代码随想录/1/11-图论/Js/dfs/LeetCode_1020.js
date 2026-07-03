//1020. 飞地的数量
const numEnclaves = function(grid) {
	let cnt=0;
	const dir=[[0,1],[1,0],[0,-1],[-1,0]];
	const n=grid.length;
	const m=grid[0].length;
	const dfs=(x,y)=>{
		grid[x][y]=0;
		cnt++;
		for(let i=0;i<4;i++){
			const nextX=x+dir[i][0];
			const nextY=y+dir[i][1];
			if(nextX<0||nextX>n-1||nextY<0||nextY>m-1) continue;
			if(grid[nextX][nextY]==1) dfs(nextX,nextY);
		}
	}
	for(let i=0;i<n;i++){
		if(grid[i][0]==1) dfs(i,0);
		if(grid[i][m-1]==1) dfs(i,m-1);
	}
	for(let j=0;j<m;j++){
		if(grid[0][j]==1) dfs(0,j);
		if(grid[n-1][j]==1) dfs(n-1,j);
	}
	cnt=0;
	for(let i=0;i<n;i++)
		for(let j=0;j<m;j++)
			if(grid[i][j]==1) dfs(i,j);
	return cnt;
};
