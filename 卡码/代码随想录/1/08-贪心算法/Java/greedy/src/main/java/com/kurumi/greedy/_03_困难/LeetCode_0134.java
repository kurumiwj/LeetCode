//134. 加油站
package com.kurumi.greedy._03_困难;

public class LeetCode_0134 {

}
class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
    int start=0;
    int current=0;
    int total=0;
    for(int i=0;i<gas.length;i++){
      current+=(gas[i]-cost[i]);
      total+=(gas[i]-cost[i]);
      if(current<0){
        current=0;
        start=i+1;
      }
    }
    if(total<0) return -1;
    return start;
  }
}
