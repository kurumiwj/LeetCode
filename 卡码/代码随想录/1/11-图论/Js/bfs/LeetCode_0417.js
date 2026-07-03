//417. 太平洋大西洋水流问题
const pacificAtlantic = function(heights) {
	const n=heights.length,m=heights[0].length;
	const visited=new Array(2).fill(0).map(item=>new Array(n).fill(0).map(item1=>new Array(m).fill(false)));
	const dir=[[0,1],[1,0],[0,-1],[-1,0]];
	const q=new Array();
	const bfs=()=>{
		while(q.length>0){
			const v=q.pop();
			for(let i=0;i<4;i++){
				const x=v[1]+dir[i][0];
				const y=v[2]+dir[i][1];
				if(x<0||x>n-1||y<0||y>m-1) continue;
				if(visited[v[0]][x][y]||heights[x][y]<heights[v[1]][v[2]]) continue;
				visited[v[0]][x][y]=true;
				q.push([v[0],x,y]);
			}
		}
	}
	for(let i=0;i<n;i++){
		visited[0][i][0]=true;
		visited[1][i][m-1]=true;
		q.push([0,i,0]);
		q.push([1,i,m-1]);
	}
	for(let j=0;j<m;j++){
		visited[0][0][j]=true;
		visited[1][n-1][j]=true;
		q.push([0,0,j]);
		q.push([1,n-1,j]);
	}
	bfs();
	const res=new Array();
	for(let i=0;i<n;i++){
		for(let j=0;j<m;j++){
			if(visited[0][i][j]&&visited[1][i][j]) res.push([i,j]);
		}
	}
	return res;
};
