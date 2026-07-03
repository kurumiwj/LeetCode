//57. 爬楼梯
#include <iostream>
#include <vector>
using namespace std;

int main(){
	int n,m;
	scanf("%d %d",&n,&m);
	vector<int> dp(n+1,0);
	dp[0]=1;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			if(i>=j) dp[i]+=dp[i-j];
			else break;
		}
	}
	printf("%d\n",dp[n]);
  system("pause");
  return 0;
}
