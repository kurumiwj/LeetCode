//39. 组合总和
package com.kurumi.backtracking._01_组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_0039 {

}
class Solution {
  List<List<Integer>> res=new ArrayList<>();
  List<Integer> path=new ArrayList<>();
  public void backtracking(int[] candidates,int target,int sum,int index){
    if(sum>target) return;
    if(sum==target){
      res.add(new ArrayList(path));
      return;
    }
    for(int i=index;i<candidates.length&&sum+candidates[i]<=target;i++){
      path.add(candidates[i]);
      backtracking(candidates, target, sum+candidates[i], i);
      path.remove(path.size()-1);
    }
  }
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates, 0, candidates.length);
    backtracking(candidates, target, 0, 0);
    return res;
  }
}
