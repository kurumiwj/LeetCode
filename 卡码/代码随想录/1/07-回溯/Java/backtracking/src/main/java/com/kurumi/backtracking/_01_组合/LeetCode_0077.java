//77. 组合
package com.kurumi.backtracking._01_组合;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_0077 {

}
class Solution {
  List<List<Integer>> res=new ArrayList<>();
  List<Integer> path=new ArrayList<>();
  public void backtracking(int n,int k,int index){
    if(path.size()==k){
      res.add(new ArrayList<>(path));
      return;
    }
    for(int i=index;i<=n+1-(k-path.size());i++){
      path.add(i);
      backtracking(n, k, i+1);
      path.remove(path.size()-1);
    }
  }
  public List<List<Integer>> combine(int n, int k) {
    backtracking(n, k, 1);
    return res;
  }
}
