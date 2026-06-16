//25. 最爱的城市
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const infinity=99999999;
let visited;
let dis;
let city;

function Dijkstra(start,n){
  dis[start]=0;
  for(let j=0;j<n;j++){
    let u=-1,minDis=infinity;
    //先找到图中边最短的一条
    for(let i=1;i<=n;i++){
      if(!visited[i]&&dis[i]<minDis){
        u=i;
        minDis=dis[i];
      }
    }
    if(u==-1) return;
    visited[u]=true;
    for(let i=1;i<=n;i++){
      //如果i未被访问并且u到i有边并且通过u到i比i最短距离要小则更新i的最短距离
      if(!visited[i]&&city[u][i]!=0&&dis[i]>dis[u]+city[u][i]) dis[i]=dis[u]+city[u][i];
    }
  }
}

void async function(){
  let line;
  while((line=await readline())){
    const [n,m]=line.split(" ").map(Number);
    visited=new Array(n+1).fill(false);
    dis=new Array(n+1).fill(infinity);
    city=new Array(n+1).fill(0).map(item=>new Array(n+1).fill(0));
    for(let i=0;i<m;i++){
      const [a,b,l]=(await readline()).split(" ").map(Number);
      city[a][b]=l;
      city[b][a]=l;
    }
    const [x,y]=(await readline()).split(" ").map(Number);
    Dijkstra(x,n);
    if(dis[y]!=infinity) console.log(dis[y]);
    else console.log("No path");
  }
}()