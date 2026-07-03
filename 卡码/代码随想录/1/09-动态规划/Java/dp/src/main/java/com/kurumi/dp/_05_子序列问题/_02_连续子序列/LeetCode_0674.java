//674. 最长连续递增序列
package com.kurumi.dp._05_子序列问题._02_连续子序列;

import java.util.Arrays;

public class LeetCode_0674 {

}
class Solution {
  public int findLengthOfLCIS(int[] nums) {
    int[] dp=new int[nums.length];
    Arrays.fill(dp,1);
    int res=1;
    for(int i=1;i<nums.length;i++){
      if(nums[i]>nums[i-1]) dp[i]=dp[i-1]+1;
      res=res>dp[i]?res:dp[i];
    }
    return res;
  }
}
