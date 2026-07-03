//53. 最大子数组和
package com.kurumi.greedy._03_困难;

public class LeetCode_0053 {

}
class Solution {
  public int maxSubArray(int[] nums) {
    int result=Integer.MIN_VALUE;
    int cnt=0;
    for(int num:nums){
      cnt+=num;
      if(cnt>result) result=cnt;
      if(cnt<=0) cnt=0;
    }
    return result;
  }
}
