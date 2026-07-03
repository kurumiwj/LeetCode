//416. 分割等和子集
package com.kurumi.dp._02_背包问题._01_01背包;

public class LeetCode_0416 {

}
class Solution {
  public boolean canPartition(int[] nums) {
    int sum=0;
    for(int num:nums) sum+=num;
    if(sum%2==1) return false;
    int[] dp=new int[10001];
    for(int i=0;i<nums.length;i++){
      for(int j=sum/2;j>=nums[i];j--){
        dp[j]=Math.max(dp[j], dp[j-nums[i]]+nums[i]);
      }
    }
    if(dp[sum/2]==sum/2) return true;
    return false;
  }
}
