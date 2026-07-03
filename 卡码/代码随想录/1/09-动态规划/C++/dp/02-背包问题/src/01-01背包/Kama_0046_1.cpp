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
	vector<int> dp(n+1,0);
	for(int i=0;i<m;i++){
		for(int j=n;j>=weight[i];j--){
			dp[j]=max(dp[j],dp[j-weight[i]]+value[i]);
		}
	}
	printf("%d\n",dp[n]);
  system("pause");
  return 0;
}
