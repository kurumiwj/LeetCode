//151. 反转字符串中的单词
#include <string>
using namespace std;

class Solution {
public:
  string reverseWords(string s) {
  	removeSpaces(s);
  	reverse(s,0,s.size()-1);
  	int start=0;
  	for(int i=0;i<=s.size();i++){	//每个单词反转
			if(i==s.size() || s[i]==' '){
				reverse(s,start,i-1);
				start=i+1;	//更新下一个起始点
			}
		}
		return s;
  }
  void reverse(string &s,int start,int end){
		for(int i=start,j=end;i<j;i++,j--)
			swap(s[i],s[j]);
	}
	void removeSpaces(string &s){
		int slow=0;
		for(int i=0;i<s.size();i++){
			if(s[i]!=' '){	//遇到空格就删除所有空格
				if(slow!=0) s[slow++]=' ';
				while(i<s.size()&&s[i]!=' ') s[slow++]=s[i++];
			}
		}
		s.resize(slow);
	}
};
