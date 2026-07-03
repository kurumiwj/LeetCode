//16. 位置互换
#include <iostream>
using namespace std;

void reverse(string &str){
	for(int i=0;i<str.length();i+=2){
		char tmp=str[i];
		str[i]=str[i+1];
		str[i+1]=tmp;
	}
}

int main(){
	int n;
	scanf("%d\n",&n);
	string str;
	for(int i=0;i<n;i++){
		cin>>str;
		reverse(str);
		cout<<str<<endl;
	}
	return 0;
}