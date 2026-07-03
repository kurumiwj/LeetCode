//56. 合并区间
package com.kurumi.greedy._03_困难;

import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode_0056 {

}
class Solution {
  public int[][] merge(int[][] intervals) {
    LinkedList<int[]> res=new LinkedList<>();
    Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
    res.add(intervals[0]);
    for(int i=1;i<intervals.length;i++){
      if(intervals[i][0]<=res.getLast()[1]){
        res.getLast()[1]=Integer.max(intervals[i][1], res.getLast()[1]);
      }else{
        res.add(intervals[i]);
      }
    }
    return res.toArray(new int[res.size()][]);
  }
}
