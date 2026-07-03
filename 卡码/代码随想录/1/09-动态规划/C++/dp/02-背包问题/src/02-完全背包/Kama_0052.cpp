//52. 携带研究材料
#include <iostream>
#include <vector>
using namespace std;

int main(){
	int n,v;
	scanf("%d %d",&n,&v);
	int weight[n];
	int value[n];
	for(int i=0;i<n;i++){
		scanf("%d %d",&weight[i],&value[i]);
	}
	vector<int> dp(v+1,0);
	for(int i=0;i<n;i++){
		for(int j=weight[i];j<=v;j++){
			dp[j]=max(dp[j],dp[j-weight[i]]+value[i]);
		}
	}
	printf("%d\n",dp[v]);
  return 0;
}
