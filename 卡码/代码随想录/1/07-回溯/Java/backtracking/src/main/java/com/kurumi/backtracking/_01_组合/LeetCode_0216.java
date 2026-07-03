//216. 组合总和 III
package com.kurumi.backtracking._01_组合;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0216 {

}
class Solution {
  List<Integer> path=new ArrayList<>();
  List<List<Integer>> res=new ArrayList<>();
  public void backtracking(int k,int n,int sum,int index){
    if(sum>n) return;
    if(k==path.size()){
      if(sum==n) res.add(new ArrayList<>(path));
      return;
    }
    for(int i=index;i<=10-(k-path.size());i++){
      path.add(i);
      backtracking(k, n, sum+i, i+1);
      path.remove(path.size()-1);
    }
  }
  public List<List<Integer>> combinationSum3(int k, int n) {
    backtracking(k, n, 0, 1);
    return res;
  }
}
