//25. 最爱的城市
#include <iostream>
using namespace std;

const int infinity=99999999;
bool visited[12];
int dis[12];
int city[12][12];

void Dijkstra(int start,int n){
	dis[start]=0;
	for(int j=0;j<n;j++){
		int u=-1,minDis=infinity;
		//找出图中路径最短的边
		for(int i=1;i<=n;i++){
			if(!visited[i]&&minDis>dis[i]){
				u=i;
				minDis=dis[i];
			}
		}
		if(u==-1) return;
		visited[u]=true;
		for(int i=1;i<=n;i++){
			//如果i未被访问过且u到i有边且通过u到达i会使得i最短距离更小则更新i的最短距离
			if(!visited[i]&&city[u][i]!=0&&dis[i]>city[u][i]+dis[u]) dis[i]=dis[u]+city[u][i];
		}
	}
}

int main(){
	int n,m,x,y,a,b,l;
	while(cin>>n>>m){
		//初始化所有路径最大，所有城市未访问
		for(int i=1;i<=n;i++){
			dis[i]=infinity;
			visited[i]=false;
			for(int j=1;j<=n;j++) city[i][j]=0;
		}
		for(int i=0;i<m;i++){
			cin>>a>>b>>l;
			city[a][b]=l;
			city[b][a]=l;
		}
		cin>>x>>y;
		Dijkstra(x,n);
		if(dis[y]!=infinity) cout<<dis[y]<<endl;
		else cout<<"No path"<<endl;
	}
	return 0;
}
