#25. 最爱的城市
import sys

visited=[]
dis=[]
infinity=99999999

def Dijkstra(city,start,n):
	dis[start]=0
	for j in range(n):
		u=-1
		minDis=infinity
		#先找到图中最短边
		for i in range(1,n+1):
			if not visited[i] and dis[i]<minDis:
				u=i
				minDis=dis[i]
		if u==-1:
			return
		visited[u]=True
		for i in range(1,n+1):
			#如果当前i未被访问过且u到i有边且通过u到i使得i最短距离更短则更新i的最短距离
			if not visited[i] and city[u][i]!=0 and dis[u]+city[u][i]<dis[i]:
				dis[i]=dis[u]+city[u][i]

def main():
	global visited
	global dis
	for line in sys.stdin:
		[n,m]=list(map(int,line.split(" ")))
		visited=[False for x in range(n+1)]
		dis=[infinity for x in range(n+1)]
		city=[[0 for x in range(n+1)] for x in range(n+1)]
		for i in range(m):
			[a,b,l]=list(map(int,sys.stdin.readline().split()))
			city[a][b]=l
			city[b][a]=l
		[x,y]=list(map(int,sys.stdin.readline().split()))
		Dijkstra(city,x,n)
		if dis[y]!=infinity:
			print(dis[y])
		else:
			print("No path")

if __name__=="__main__":
	main()