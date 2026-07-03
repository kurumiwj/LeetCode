//28. 找出字符串中第一个匹配项的下标
#include <string>
using namespace std;

class Solution {
public:
  int strStr(string haystack, string needle) {
    int next[needle.size()];
    int j=0;
    next[j]=0;
    for(int i=1;i<needle.size();i++){
      if(j>0&&needle[i]!=needle[j]) j=next[j-1];
      if(needle[i]==needle[j]) j++;
      next[i]=j;
    }
    j=0;
    for(int i=0;i<haystack.size();i++){
      while(j>0&&needle[j]!=haystack[i]) j=next[j-1];
      if(needle[j]==haystack[i]) j++;
      if(j==needle.size()) return i-j+1;
    }
    return -1;
  }
};
