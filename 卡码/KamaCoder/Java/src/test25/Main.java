//25. 最爱的城市
package test25;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	private static int infinity=99999999;
	private static boolean[] visited;
	private static int[] dis;
	private static int[][] city;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n=scanner.nextInt(),m=scanner.nextInt();
			city=new int[n+1][n+1];
			for(int i=0;i<m;i++) {
				int a=scanner.nextInt(),b=scanner.nextInt(),l=scanner.nextInt();
				city[a][b]=l;
				city[b][a]=l;
			}
			visited=new boolean[n+1];
			dis=new int[n+1];
			for(int i=1;i<=n;i++) {
				visited[i]=false;
				dis[i]=infinity;
			}
			int x=scanner.nextInt(),y=scanner.nextInt();
			Dijkstra(x, n);
			if(dis[y]!=infinity) System.out.println(dis[y]);
			else System.out.println("No path");
		}
	}
	public static void Dijkstra(int start,int n) {
		dis[start]=0;
		for(int i=0;i<n;i++) {
			int u=-1,minDis=infinity;
			for(int j=1;j<=n;j++) {
				//先找出city中的最短边
				if(!visited[j]&&dis[j]<minDis) {
					u=j;
					minDis=dis[j];
				}
			}
			if(u==-1) return;
			visited[u]=true;
			for(int j=1;j<=n;j++) {
				//如果j未被访问过并且u到j之间有边并且从u到j距离小于当前j的最短距离则更新j的最短距离
				if(city[u][j]!=0&&!visited[j]&&dis[u]+city[u][j]<dis[j]) {
					dis[j]=dis[u]+city[u][j];
				}
			}
		}
	}
}
