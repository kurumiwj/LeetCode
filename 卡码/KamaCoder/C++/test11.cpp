//11. 共同祖先
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
	int n;
	while(scanf("%d\n",&n)!=EOF){
		int commons[21];
		fill(commons,commons+21,0);
		for(int i=0;i<n;i++){
			int a,b;
			scanf("%d %d\n",&a,&b);
			commons[a]=b;
		}
		int height1=0,height2=0;
		int start1=1,start2=2;
		while(commons[start1]!=0){
			height1++;
			start1=commons[start1];
		}
		while(commons[start2]!=0){
			height2++;
			start2=commons[start2];
		}
		if(height1>height2) printf("You are my elder\n");
		else if(height1<height2) printf("You are my younger\n");
		else printf("You are my brother\n");
	}
	return 0;
}