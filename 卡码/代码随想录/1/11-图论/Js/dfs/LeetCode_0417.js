//417. 太平洋大西洋水流问题
const pacificAtlantic = function(heights) {
	const n=heights.length,m=heights[0].length;
	const visited=new Array(2).fill(0).map(item=>new Array(n).fill(0).map(item1=>new Array(m).fill(false)));
	const dir=[[0,1],[1,0],[0,-1],[-1,0]];
	const dfs=(x,y,flag)=>{
		visited[flag][x][y]=true;
		for(let i=0;i<4;i++){
			const nextX=x+dir[i][0];
			const nextY=y+dir[i][1];
			if(nextX<0||nextX>n-1||nextY<0||nextY>m-1) continue;
			if(visited[flag][nextX][nextY]||heights[nextX][nextY]<heights[x][y]) continue;
			dfs(nextX,nextY,flag);
		}
	}
	for(let i=0;i<n;i++){
		dfs(i,0,0);
		dfs(i,m-1,1);
	}
	for(let j=0;j<m;j++){
		dfs(0,j,0);
		dfs(n-1,j,1);
	}
	const res=new Array();
	for(let i=0;i<n;i++){
		for(let j=0;j<m;j++){
			if(visited[0][i][j]&&visited[1][i][j]) res.push([i,j]);
		}
	}
	return res;
};
