//150. 逆波兰表达式求值
#include <vector>
#include <string>
using namespace std;
class Solution {
public:
  int evalRPN(vector<string>& tokens) {
    stack<int> nums;
    int n1,n2;
    for(string token:tokens){
      if(token=="+"||token=="-"||token=="*"||token=="/"){
        n2=nums.top();
        nums.pop();
        n1=nums.top();
        nums.pop();
        if(token=="+") nums.push(n1+n2);
        else if(token=="-") nums.push(n1-n2);
        else if(token=="*") nums.push(n1*n2);
        else nums.push(n1/n2);
      }else{
        nums.push(stoi(token));
      }
    }
    return nums.top();
  }
};
