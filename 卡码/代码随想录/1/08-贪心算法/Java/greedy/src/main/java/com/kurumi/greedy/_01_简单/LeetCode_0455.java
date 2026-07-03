//455. 分发饼干
package com.kurumi.greedy._01_简单;

import java.util.Arrays;

public class LeetCode_0455 {

}
class Solution {
  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int index=s.length-1;
    int res=0;
    for(int i=g.length-1;i>=0;i--){
      if(index<0) break;
      if(s[index] >= g[i]){
        index--;
        res++;
      }
    }
    return res;
  }
}
