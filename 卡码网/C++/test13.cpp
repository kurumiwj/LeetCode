//13. 镂空三角形
#include <iostream>
using namespace std;

void printSpace(int n){
	for(int i=0;i<n;i++) printf(" ");
}

void printLine(char x,int n){
	printf("%c",x);
	for(int i=0;i<n-2;i++) printf(" ");
	printf("%c",x);
}

int main(){
	char x;
	int n;
	while(scanf("%c %d\n",&x,&n)!=EOF){
		if(x=='@') break;
		for(int i=1;i<=n;i++){
			printSpace(n-i);
			if(i==1||i==n)
				for(int j=1;j<=2*i-1;j++) printf("%c",x);
			else printLine(x,2*i-1);
			printf("\n");
		}
		printf("\n");
	}
	return 0;
}