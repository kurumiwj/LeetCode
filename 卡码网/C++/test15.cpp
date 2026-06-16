//15. 神秘字符
#include <iostream>
using namespace std;

string merge(string first,string second){
	int middle=first.length()/2;
	return first.substr(0,middle)+second+first.substr(middle);
}

int main(){
	int n;
	scanf("%d\n",&n);
	string first,second;
	for(int i=0;i<n;i++){
		cin>>first>>second;
		cout<<merge(first,second)<<endl;
	}
	return 0;
}