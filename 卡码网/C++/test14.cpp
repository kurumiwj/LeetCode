//14. 句子缩写
#include <iostream>
using namespace std;

void printFirstUpperLetter(string str){
	printf("%c",toupper(str[0]));
	int index=str.find(" ");	//找到空格的下标
	//未到字符串结尾
	while(index!=string::npos&&index<str.length()){
		int j;
		for(j=index+1;j<str.length();j++){
			if(str[j]!=' '){
				printf("%c",toupper(str[j]));
				break;
			}
		}
		index=str.find(" ",j);
	}
}

int main(){
	int n;
	scanf("%d\n",&n);
	for(int i=0;i<n;i++){
		string tmp;
		getline(cin,tmp);
		printFirstUpperLetter(tmp);
		printf("\n");
	}
	return 0;
}