//9. 奇怪的信
#include <iostream>
using namespace std;

int main(){
	string str;
	while(cin>>str){
		int res=0;
		for(int i=0;i<str.length();i++){
			if((str[i]-'0')%2==0){
				res+=str[i]-'0';
			}
		}
		printf("%d\n\n",res);
	}
	return 0;
}