//1047. 删除字符串中的所有相邻重复项
#include <string>
#include <algorithm>;
using namespace std;

class Solution {
public:
  string removeDuplicates(string s) {
    stack<char> st;
    for(char ch:s){
      if(st.empty()||st.top()!=ch) st.push(ch);
      else st.pop();
    }
    string res="";
    while(!st.empty()){
      res+=st.top();
      st.pop();
    }
    reverse(res.begin(),res.end());
    return res;
  }
};
