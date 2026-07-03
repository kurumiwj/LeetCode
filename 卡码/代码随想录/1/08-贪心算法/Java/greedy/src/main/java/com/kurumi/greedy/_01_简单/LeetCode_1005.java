//1005. K 次取反后最大化的数组和
package com.kurumi.greedy._01_简单;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeetCode_1005 {

}
class Solution {
  public int largestSumAfterKNegations(int[] nums, int k) {
    nums = IntStream.of(nums).boxed().sorted((x,y)->-Integer.compare(Math.abs(x), Math.abs(y))).mapToInt(Integer::intValue).toArray();
    for(int i=0;i<nums.length;i++){
      if(nums[i]<0&&k>0){
        nums[i]=-nums[i];
        k--;
      }
    }
    if(k%2==1) nums[nums.length-1]=-nums[nums.length-1];
    return Arrays.stream(nums).sum();
  }
}
