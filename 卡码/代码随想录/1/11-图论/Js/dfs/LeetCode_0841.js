//841. 钥匙和房间
const canVisitAllRooms = function(rooms) {
  const visited=new Array(rooms.length).fill(false);
  const dfs=(key)=>{
    if(visited[key]) return;
    visited[key]=true;
    const keys=rooms[key];
    for(let key of keys){
      if(!visited[key]) dfs(key);
    }
  }
  dfs(0);
  return visited.every(item=>item==true);
};
