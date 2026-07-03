//459. 重复的子字符串
#include <string>
using namespace std;

class Solution {
public:
  bool repeatedSubstringPattern(string s) {
    int n=s.size();
    //法一
//    string s1=s+s;
//    string s2=s1.substr(1,2*n-2);
//    return s2.find(s)!=string::npos;
    //法二
    int next[n];
    next[0]=0;
    int j=0;
    for(int i=1;i<n;i++){
      while(j>0&&s[i]!=s[j]) j=next[j-1];
      if(s[i]==s[j]) j++;
      next[i]=j;
    }
    return next[n-1]!=0&&n%(n-next[n-1])==0;
  }
};
