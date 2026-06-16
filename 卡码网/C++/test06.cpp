//6. A+B问题VIII
#include <iostream>
using namespace std;

int main(){
	int n;
	while(scanf("%d\n",&n)!=EOF){
		int m;
		for(int i=0;i<n;i++){
			scanf("%d",&m);
			int sum=0;
			for(int j=0;j<m;j++){
				int tmp;
				scanf("%d",&tmp);
				sum+=tmp;
			}
			printf("%d\n",sum);
			if(i!=n-1) printf("\n");
		}
	}
	return 0;
}