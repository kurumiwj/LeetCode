//25. 最爱的城市
package main

import "fmt"

var (
	visited []bool
	infinity=99999999
)

func Dijkstra(city [][]int,dis []int,n,start int){
	dis[start]=0
	for j:=0;j<n;j++ {
		u,minDis:=-1,infinity
		//先找到当前图中边最短的一条
		for i:=1;i<=n;i++ {
			if !visited[i]&&dis[i]<minDis {
				u=i
				minDis=dis[i]
			}
		}
		//所有顶点都不可达
		if u==-1 {
			return
		}
		visited[u]=true
		for i:=1;i<=n;i++ {
			//如果当前i未被访问过且u到i之间有边并且从u到i距离小于当前i的最短距离则更新i的最短距离
			if city[u][i]!=0&&!visited[i]&&dis[u]+city[u][i]<dis[i] {
				dis[i]=dis[u]+city[u][i]
			}
		}
	}
}

func main(){
	var n,m,x,y,a,b,l int
	for {
		_,err:=fmt.Scan(&n,&m)
		if err!=nil {
			break
		}
		var city=make([][]int,n+1)
		var dis=make([]int,n+1)
		visited=make([]bool,n+1)
		for i:=0;i<=n;i++ {
			dis[i]=infinity
			city[i]=make([]int,n+1)
			visited[i]=false	//初始化每个城市未访问
		}
		for i:=0;i<m;i++ {
			fmt.Scan(&a,&b,&l)
			city[a][b]=l
			city[b][a]=l
		}
		fmt.Scan(&x,&y)
		Dijkstra(city,dis,n,x)
		if dis[y]==infinity {
			fmt.Println("No path")
		}else{
			fmt.Println(dis[y])
		}
	}
}
