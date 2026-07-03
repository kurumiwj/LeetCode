//8. 摆平积木
#include <iostream>

using namespace std;

int main(){
	int n;
	while(scanf("%d",&n)!=EOF){
		if(n==0){
			return 0;
		}
		int nums[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			scanf("%d",&nums[i]);
			sum+=nums[i];
		}
		int avg=sum/n;
		int total=0;
		for(int i=0;i<n;i++){
			if(nums[i]>avg){
				total+=nums[i]-avg;
			}
		}
		cout<<total<<endl;
		printf("\n");
	}
	return 0;
}
