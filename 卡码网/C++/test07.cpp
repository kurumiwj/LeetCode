//7. 平均绩点
#include <iostream>
using namespace std;

int indexOf(string str,char ch){
	for(int i=0;i<str.length();i++){
		if(str[i]==ch) return i;
	}
	return -1;
}

int main(){
	string scores="FDCBA";
	string line;
	while(getline(cin,line)){
		bool flag=false;	//记录是有有奇怪的字符混入
		double total=0;
		for(int i=0;i<line.length();i+=2){
			int index=indexOf(scores,line[i]);
			if(index==-1) {
				flag=true;
				break;
			}
			total+=index;
		}
		if(flag) printf("Unknown\n");
		else printf("%.2f\n",total/(line.length()/2+1));
	}
	return 0;
}