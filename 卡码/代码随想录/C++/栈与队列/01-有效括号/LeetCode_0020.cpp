//20. ÓÐÐ§µÄÀ¨ºÅ
#include <string>
using namespace std;

class Solution {
public:
  bool isValid(string s) {
    if(s.length()%2!=0) return false;
    stack<char> st;
    for(char ch:s){
      if(ch=='(') st.push(')');
      else if(ch=='[') st.push(']');
      else if(ch=='{') st.push('}');
      else if(st.empty()||st.top()!=ch) return false;
      else st.pop();
    }
    return st.empty();
  }
};
