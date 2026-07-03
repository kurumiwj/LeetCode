//139. 单词拆分
package com.kurumi.dp._02_背包问题._02_完全背包;

import java.util.Arrays;
import java.util.List;

public class LeetCode_0139 {

}
class Solution {
  public boolean wordBreak(String s, List<String> wordDict) {
    boolean[] dp=new boolean[s.length()+1];
    Arrays.fill(dp,false);
    dp[0]=true;
    for(int i=1;i<=s.length();i++){
      for(int j=0;j<i;j++){
        if(wordDict.contains(s.substring(j, i))&&dp[j]==true) dp[i]=true;
      }
    }
    return dp[s.length()];
  }
}
