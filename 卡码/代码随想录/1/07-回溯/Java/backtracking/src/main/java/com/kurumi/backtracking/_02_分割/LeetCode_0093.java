//93. 复原 IP 地址
package com.kurumi.backtracking._02_分割;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0093 {

}
class Solution {
  List<String> res=new ArrayList<>();
  public boolean isValid(StringBuilder s,int start,int end){
    if(start>end) return false;
    if(s.charAt(start)=='0'&&start!=end) return false;
    int num=0;
    for(int i=start;i<=end;i++){
      int digit = s.charAt(i) - '0';
      if (digit < 0 || digit > 9) return false;
      num = num * 10 + digit;
      if (num > 255) return false;
    }
    return true;
  }
  public void backtracking(StringBuilder s,int index,int dotNum){
    if(dotNum==3){
      if(isValid(s, index, s.length()-1)) res.add(s.toString());
      return;
    }
    for(int i=index;i<s.length()&&i-index<3;i++){
      if(isValid(s, index, i)){
        s.insert(i+1, '.');
        backtracking(s, i+2, dotNum+1);
        s.deleteCharAt(i+1);
      }else break;
    }
  }
  public List<String> restoreIpAddresses(String s) {
    backtracking(new StringBuilder(s), 0, 0);
    return res;
  }
}
