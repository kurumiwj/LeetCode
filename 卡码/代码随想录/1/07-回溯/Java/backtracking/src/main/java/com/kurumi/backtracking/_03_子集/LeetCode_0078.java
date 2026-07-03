//78. 子集
package com.kurumi.backtracking._03_子集;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_0078 {

}
class Solution {
  Deque<Integer> path=new LinkedList<>();
  List<List<Integer>> res=new ArrayList<>();
  public void backtracking(int[] nums,int index){
    res.add(new ArrayList<>(path));
    if(index>=nums.length) return;
    for(int i=index;i<nums.length;i++){
      path.add(nums[i]);
      backtracking(nums, i+1);
      path.removeLast();
    }
  }
  public List<List<Integer>> subsets(int[] nums) {
    backtracking(nums, 0);
    return res;
  }
}
