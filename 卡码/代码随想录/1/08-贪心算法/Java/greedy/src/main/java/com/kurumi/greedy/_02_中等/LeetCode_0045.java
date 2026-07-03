//45. 跳跃游戏 II
package com.kurumi.greedy._02_中等;

public class LeetCode_0045 {

}
class Solution {
  public int jump(int[] nums) {
    int cur=0,next=0,res=0;
    for(int i=0;i<nums.length-1;i++){
      next=Math.max(i+nums[i], next);
      if(cur==i){
        cur=next;
        res++;
      }
    }
    return res;
  }
}
