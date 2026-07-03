//55. 跳跃游戏
package com.kurumi.greedy._02_中等;

public class LeetCode_0055 {

}
class Solution {
  public boolean canJump(int[] nums) {
    int cover=0;
    if(nums.length==1) return true;
    for(int i=0;i<=cover;i++){
      cover=Integer.max(i+nums[i], cover);
      if(cover>=nums.length-1) return true;
    }
    return false;
  }
}
