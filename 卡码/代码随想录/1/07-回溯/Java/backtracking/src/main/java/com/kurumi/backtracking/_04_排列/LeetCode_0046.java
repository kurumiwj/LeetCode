//46. 全排列
package com.kurumi.backtracking._04_排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_0046 {

}
class Solution {
  Deque<Integer> path=new LinkedList<>();
  List<List<Integer>> res=new ArrayList<>();
  boolean[] visited;
  public void backtracking(int[] nums){
    if(path.size()==nums.length){
      res.add(new ArrayList<>(path));
      return;
    }
    for(int i=0;i<nums.length;i++){
      if(visited[i]) continue;
      visited[i]=true;
      path.offer(nums[i]);
      backtracking(nums);
      path.removeLast();
      visited[i]=false;
    }
  }
  public List<List<Integer>> permute(int[] nums) {
    visited=new boolean[nums.length];
    Arrays.fill(visited, false);
    backtracking(nums);
    return res;
  }
}
