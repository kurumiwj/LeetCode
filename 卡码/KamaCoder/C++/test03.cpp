//3. A+B问题III
#include <iostream>
using namespace std;

int main(){
	int a,b;
	while(scanf("%d %d\n",&a,&b)!=EOF){
		if(a==0&&b==0) break;
		cout<<a+b<<endl;
	}
	return 0;
}