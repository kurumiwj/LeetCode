//4. A+B问题IV
#include <iostream>
using namespace std;

int main(){
	int n;
	while(scanf("%d",&n)!=EOF){
		if(n==0) break;
		int sum=0;
		for(int i=0;i<n;i++){
			int tmp;
			scanf("%d",&tmp);
			sum+=tmp;
		}
		printf("%d\n",sum);
	}
	return 0;
}