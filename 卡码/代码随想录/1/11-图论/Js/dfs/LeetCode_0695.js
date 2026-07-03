//695. 岛屿的最大面积
const maxAreaOfIsland = function(grid) {
	const n=grid.length;
	const m=grid[0].length;
	let cnt=1,res=0;
	const dir=[[0,1],[1,0],[0,-1],[-1,0]];
	const dfs=(x,y)=>{
		grid[x][y]=0;
		for(let i=0;i<4;i++){
			const nextX=x+dir[i][0];
			const nextY=y+dir[i][1];
			if(nextX<0||nextX>n-1||nextY<0||nextY>m-1) continue;
			if(grid[nextX][nextY]==1){
				cnt++;
				dfs(nextX,nextY);
			}
		}
	}
	for(let i=0;i<n;i++){
		for(let j=0;j<m;j++){
			if(grid[i][j]==1){
				cnt=1;
				dfs(i,j);
				res=Math.max(res,cnt);
			}
		}
	}
	return res;
};
