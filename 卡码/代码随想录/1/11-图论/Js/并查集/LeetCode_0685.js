//685. 冗余连接 II
const findRedundantDirectedConnection = function(edges) {
  const n=edges.length;
  const father=new Array(n+1).fill(0);
  const init=()=>{
    for(let i=0;i<n;i++) father[i]=i;
  }
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
  const removeEdge=()=>{
    init();
    let res=[];
    for(let i=0;i<n;i++){
      if(isSame(edges[i][0],edges[i][1])) res=edges[i];
      else join(edges[i][0],edges[i][1]);
    }
    return res;
  }
  const isTreeAfterRemoveEdge=deleteEdge=>{
    init();
    for(let i=0;i<n;i++){
      if(i==deleteEdge) continue;
      if(isSame(edges[i][0],edges[i][1])) return false;
      join(edges[i][0],edges[i][1]);
    }
    return true;
  }
  const inDegrees=new Array(n+1).fill(0);
  for(let i=0;i<n;i++) inDegrees[edges[i][1]]++;
  const v2=new Array();
  for(let i=n-1;i>=0;i--){
    if(inDegrees[edges[i][1]]==2) v2.push(i);
  }
  if(v2.length>1){
    if(isTreeAfterRemoveEdge(v2[0])) return edges[v2[0]];
    else return edges[v2[1]];
  }
  return removeEdge();
};
