//1971. 寻找图中是否存在路径
const validPath = function(n, edges, source, destination) {
  const father=new Array(n).fill(0).map((item,index)=>index);
  const find=u=>{
    return u==father[u] ? u : father[u]=find(father[u]);
  }
  const isSame=(u,v)=>{
    u=find(u);
    v=find(v);
    return u==v;
  }
  const join=(u,v)=>{
    u=find(u);
    v=find(v);
    if(u==v) return;
    father[u]=v;
  }
  for(let i=0;i<edges.length;i++){
    join(edges[i][0],edges[i][1]);
  }
  return isSame(source,destination);
};
