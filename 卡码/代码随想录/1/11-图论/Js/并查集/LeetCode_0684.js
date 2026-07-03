//684. 冗余连接
const findRedundantConnection = function(edges) {
  const n=edges.length;
  const father=new Array(n+1).fill(0).map((item,index)=>index);
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
    father[v]=u;
  }
  let res=new Array();
  edges.forEach(edge=>{
    if(isSame(edge[0],edge[1])) res=Array.from(edge);
    else join(edge[0],edge[1]);
  });
  return res;
};
