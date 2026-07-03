//20. 删除重复元素
#include <iostream>

using namespace std;

int main(){
	int n;
	while(scanf("%d",&n)!=EOF){
		if(n==0){
			printf("list is empty\n");
			continue;
		}
		int nums[n];
		for(int i=0;i<n;i++){
			if(i!=0) printf(" ");
			scanf("%d",&nums[i]);
			printf("%d",nums[i]);
		}
		printf("\n%d",nums[0]);
		for(int i=1;i<n;i++){
			if(nums[i]!=nums[i-1]) printf(" %d",nums[i]);
		}
		printf("\n");
	}
	return 0;
}