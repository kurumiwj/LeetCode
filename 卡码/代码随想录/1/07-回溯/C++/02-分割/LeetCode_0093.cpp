//93. 复原 IP 地址
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
	vector<string> res;
public:
	bool isValid(const string& s,int start,int end){
		if(start>end) return false;
		if(s[start]=='0'&&start!=end) return false;
		int num=0;
		for(int i=start;i<=end;i++){
			int digit=s[i]-'0';
			if(digit<0||digit>9) return false;
			num=num*10+digit;
			if(num>255) return false;
		}
		return true;
	}
	void backtracking(string& s,int index,int dotNum){
		if(dotNum==3){
			if(isValid(s,index,s.length()-1)) res.push_back(s);
			return;
		}
		for(int i=index;i<s.length()&&i-index<3;i++){
			if(isValid(s,index,i)){
				s.insert(s.begin()+i+1,'.');
				backtracking(s,i+2,dotNum+1);
				s.erase(s.begin()+i+1);
			}else break;
		}
	}
	vector<string> restoreIpAddresses(string s) {
		backtracking(s,0,0);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
