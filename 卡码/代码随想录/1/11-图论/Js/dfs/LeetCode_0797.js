//797. 所有可能的路径
const allPathsSourceTarget = function(graph) {
	const res=new Array();
	const path=new Array();
	const dfs=(index)=>{
		if(index==graph.length-1){
			res.push(Array.from(path));
			return;
		}
		for(let i=0;i<graph[index].length;i++){
			path.push(graph[index][i]);
			dfs(graph[index][i]);
			path.pop();
		}
	}
	path.push(0);
	dfs(0);
	return res;
};
