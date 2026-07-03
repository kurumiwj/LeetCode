//200. 岛屿数量
const numIslands = function(grid) {
  const dir=[[0,1],[1,0],[0,-1],[-1,0]];
	let res=0;
	const n=grid.length;
	const m=grid[0].length;
	const bfs=(x,y)=>{
		grid[x][y]="0";
		const q=[[x,y]];
		while(q.length>0){
			const v=q.shift();
			for(let i=0;i<4;i++){
				const nextX=v[0]+dir[i][0];
				const nextY=v[1]+dir[i][1];
				if(nextX<0||nextX>=n||nextY<0||nextY>=m) continue;
				if(grid[nextX][nextY]=="1"){
					grid[nextX][nextY]="0";
					q.push([nextX,nextY]);
				}
			}
		}
	}
	for(let i=0;i<n;i++){
		for(let j=0;j<m;j++){
			if(grid[i][j]=="1"){
				res++;
				bfs(i,j);
			}
		}
	}
	return res;
};
