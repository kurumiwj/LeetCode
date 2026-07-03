//56. 携带矿石资源
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
	int c,n;
	scanf("%d %d",&c,&n);
	vector<int> w(n),v(n),k(n);
	for(int i=0;i<n;i++){
		scanf("%d",&w[i]);
	}
	for(int i=0;i<n;i++){
		scanf("%d",&v[i]);
	}
	for(int i=0;i<n;i++){
		scanf("%d",&k[i]);
	}
	vector<int> dp(c+1,0);
	for(int i=0;i<n;i++){
		for(int j=c;j>=w[i];j--){
			for(int l=1;l<=k[i]&&(j-l*w[i])>=0;l++){
				dp[j]=max(dp[j],dp[j-l*w[i]]+l*v[i]);
			}
		}
	}
	printf("%d\n",dp[c]);
  return 0;
}
