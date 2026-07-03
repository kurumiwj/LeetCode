//130. 被围绕的区域
const solve = function(board) {
	const dir=[[0,1],[1,0],[0,-1],[-1,0]];
	const n=board.length,m=board[0].length;
	const bfs=(x,y)=>{
		board[x][y]="Y";
		const q=[x,y];
		while(q.length>0){
			y=q.pop();
			x=q.pop();
			for(let i=0;i<4;i++){
				const nextX=x+dir[i][0];
				const nextY=y+dir[i][1];
				if(nextX<0||nextX>n-1||nextY<0||nextY>m-1) continue;
				if(board[nextX][nextY]=="O"){
					q.push(nextX,nextY);
					board[nextX][nextY]="Y";
				}
			}
		}

	}
	for(let i=0;i<n;i++){
		if(board[i][0]=="O") bfs(i,0);
		if(board[i][m-1]=="O") bfs(i,m-1);
	}
	for(let j=0;j<m;j++){
		if(board[0][j]=="O") bfs(0,j);
		if(board[n-1][j]=="O") bfs(n-1,j);
	}
	for(let i=0;i<n;i++){
		for(let j=0;j<m;j++){
			if(board[i][j]=="O") board[i][j]="X";
			if(board[i][j]=="Y") board[i][j]="O";
		}
	}
};
