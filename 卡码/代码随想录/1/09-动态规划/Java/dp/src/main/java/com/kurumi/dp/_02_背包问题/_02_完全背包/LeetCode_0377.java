//377. 组合总和 Ⅳ
package com.kurumi.dp._02_背包问题._02_完全背包;

public class LeetCode_0377 {

}
class Solution {
  public int combinationSum4(int[] nums, int target) {
    int[] dp=new int[target+1];
    dp[0]=1;
    for(int i=0;i<=target;i++){
      for(int num:nums){
        if(i>=num) dp[i]+=dp[i-num];
      }
    }
    return dp[target];
  }
}
