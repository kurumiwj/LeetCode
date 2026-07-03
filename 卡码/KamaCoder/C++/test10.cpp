//10. 运营商活动
#include <iostream>
using namespace std;

int main(){
	int m,k;
	while(scanf("%d %d\n",&m,&k)!=EOF){
		if(m==0&&k==0) break;
		int total=m;
		while(m>=k){
			int left=m/k;
			total+=left;
			m=left+m%k;
		}
		printf("%d\n",total);
	}
	return 0;
}