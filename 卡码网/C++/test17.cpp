//17. 出栈合法性
#include <iostream>
#include <stack>
using namespace std;

int main(){
	int n;
	while(scanf("%d\n",&n)!=EOF){
		if(n==0) break;
		int nums[n];
		for(int i=0;i<n;i++){
			int tmp;
			scanf("%d",&tmp);
			nums[i]=tmp;
		}
		int index=0;
		stack<int> s;
		for(int i=1;i<=n;i++){
			s.push(i);
			while(!s.empty()&&s.top()==nums[index]){
				s.pop();
				index++;
			}
		}
		if(s.empty()&&index==n) printf("Yes\n");
		else printf("No\n");
	}
	return 0;
}