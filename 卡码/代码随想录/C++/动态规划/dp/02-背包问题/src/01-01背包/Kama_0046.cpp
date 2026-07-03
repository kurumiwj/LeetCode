//46. 携带研究材料
#include <iostream>
#include <vector>
using namespace std;

int main(){
	int m,n;
	scanf("%d %d",&m,&n);
	int weight[m];
	int value[m];
	for(int i=0;i<m;i++){
		scanf("%d",&weight[i]);
	}
	for(int i=0;i<m;i++){
		scanf("%d",&value[i]);
	}
	vector<vector<int>> dp(m,vector<int>(n+1,0));
	for(int i=weight[0];i<=n;i++) dp[0][i]=value[0];
	for(int i=1;i<m;i++){
		for(int j=1;j<n+1;j++){
			if(j<weight[i]){
				dp[i][j]=dp[i-1][j];
			}else{
				dp[i][j]=max(dp[i-1][j-weight[i]]+value[i],dp[i-1][j]);
			}
		}
	}
	printf("%d\n",dp[m-1][n]);
  system("pause");
  return 0;
}
