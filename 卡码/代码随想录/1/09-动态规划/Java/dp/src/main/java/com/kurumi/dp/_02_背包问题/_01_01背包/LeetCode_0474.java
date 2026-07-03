//474. 一和零
package com.kurumi.dp._02_背包问题._01_01背包;

public class LeetCode_0474 {

}
class Solution {
  public int findMaxForm(String[] strs, int m, int n) {
    int[][] dp=new int[m+1][n+1];
    for(String str:strs){
      int x=0,y=0;
      for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0') x++;
        else y++;
      }
      for(int i=m;i>=x;i--){
        for(int j=n;j>=y;j--){
          dp[i][j]=Math.max(dp[i][j], dp[i-x][j-y]+1);
        }
      }
    }
    return dp[m][n];
  }
}
