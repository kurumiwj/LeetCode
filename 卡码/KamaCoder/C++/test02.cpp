//2. A+B问题II
#include <iostream>
using namespace std;

int main(){
	int n;
	while(scanf("%d\n",&n)!=EOF){
		int a,b;
		for(int i=0;i<n;i++){
			scanf("%d %d",&a,&b);
			printf("%d\n",a+b);
		}
	}
}