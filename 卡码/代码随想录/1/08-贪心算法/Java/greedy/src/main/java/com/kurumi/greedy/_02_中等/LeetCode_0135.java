//135. 分发糖果
package com.kurumi.greedy._02_中等;

import java.util.Arrays;

public class LeetCode_0135 {

}
class Solution {
  public int candy(int[] ratings) {
    int[] can=new int[ratings.length];
    Arrays.fill(can, 1);
    for(int i=1;i<ratings.length;i++)
      if(ratings[i]>ratings[i-1]) can[i]=can[i-1]+1;
    for(int i=ratings.length-2;i>=0;i--)
      if(ratings[i]>ratings[i+1]) can[i]=Integer.max(can[i+1]+1,can[i]);
    int sum=0;
    for(int val:can) sum+=val;
    return sum;
  }
}
