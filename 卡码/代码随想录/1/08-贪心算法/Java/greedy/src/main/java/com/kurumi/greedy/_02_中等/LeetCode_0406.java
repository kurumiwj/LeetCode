//406. 根据身高重建队列
package com.kurumi.greedy._02_中等;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode_0406 {

}
class Solution {
  public int[][] reconstructQueue(int[][] people) {
    LinkedList<int[]> queue = new LinkedList<>();
    Arrays.sort(people,(p1,p2)->{
      if(p1[0]==p2[0]) return p1[1]-p2[1];
      else return p2[0]-p1[0];
    });
    for(int[] p:people)
      queue.add(p[1],p);
    return queue.toArray(new int[people.length][]);
  }
}
