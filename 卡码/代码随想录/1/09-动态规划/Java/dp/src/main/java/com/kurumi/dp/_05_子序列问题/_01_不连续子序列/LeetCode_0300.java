//300. 最长递增子序列
package com.kurumi.dp._05_子序列问题._01_不连续子序列;

import java.util.Arrays;

public class LeetCode_0300 {

}
class Solution {
  public int lengthOfLIS(int[] nums) {
    int[] dp=new int[nums.length];
    Arrays.fill(dp, 1);
    int res=1;
    for(int i=1;i<nums.length;i++){
      for(int j=0;j<i;j++)
        if(nums[i]>nums[j]) dp[i]=Math.max(dp[i], dp[j]+1);
      res=res>dp[i] ? res : dp[i];
    }
    return res;
  }
}
