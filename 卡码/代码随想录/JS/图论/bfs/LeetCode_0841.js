//841. 钥匙和房间
const canVisitAllRooms = function(rooms) {
  const bfs=()=>{
    const visited=new Array(rooms.length).fill(false);
    const q=new Array();
    q.push(0);
    visited[0]=true;
    while(q.length>0){
      const key=q.shift();
      const keys=rooms[key];
      for(let k of keys){
        if(!visited[k]){
          visited[k]=true;
          q.push(k);
        }
      }
    }
    return visited.every(item=>item==true);
  }
  return bfs();
};
