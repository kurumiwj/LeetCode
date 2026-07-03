//53. 最大子数组和
package com.kurumi.dp._05_子序列问题._02_连续子序列;

public class LeetCode_0053 {

}
class Solution {
  public int maxSubArray(int[] nums) {
    int[] dp=new int[nums.length];
    dp[0]=nums[0];
    int res=nums[0];
    for(int i=1;i<nums.length;i++){
      dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
      res=dp[i]>res?dp[i]:res;
    }
    return res;
  }
}
