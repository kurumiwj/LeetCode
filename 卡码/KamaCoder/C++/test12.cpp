//12. 打印数字图形
#include <iostream>
using namespace std;

void printSpace(int n){
	for(int i=0;i<n;i++) printf(" ");
}

void printLine(int n){
	for(int i=1;i<=n;i++) printf("%d",i);
	for(int i=n-1;i>=1;i--) printf("%d",i);
	printf("\n");
}

int main(){
	int n;
	while(scanf("%d",&n)!=EOF){
		for(int i=1;i<=n;i++){
			printSpace(n-i);
			printLine(i);
		}
		for(int i=n-1;i>=1;i--){
			printSpace(n-i);
			printLine(i);
		}
	}
	return 0;
}