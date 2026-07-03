//17. 电话号码的字母组合
package com.kurumi.backtracking._01_组合;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0017 {

}
class Solution {
  final String[] numMap=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
  List<String> res=new ArrayList<>();
  void dfs(String digits,int index,StringBuilder str){
    if(index==digits.length()){
      res.add(str.toString());
      return;
    }
    int digit = digits.charAt(index)-'0';
    String letter = numMap[digit];
    for(int i=0;i<letter.length();i++){
      str.append(letter.charAt(i));
      dfs(digits, index+1, str);
      str.deleteCharAt(str.length()-1);
    }
  }
  public List<String> letterCombinations(String digits) {
    if(digits.length()==0) return res;
    dfs(digits, 0, new StringBuilder(""));
    return res;
  }
}
