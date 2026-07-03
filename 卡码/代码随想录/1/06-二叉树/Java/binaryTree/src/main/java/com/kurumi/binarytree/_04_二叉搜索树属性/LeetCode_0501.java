//501. 二叉搜索树中的众数
package com.kurumi.binarytree._04_二叉搜索树属性;

import com.kurumi.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LeetCode_0501 {

}
class Solution {
  List<Integer> res=new ArrayList<>();
  TreeNode pre=null;
  int maxCount=0;
  int count=0;
  public void traversal(TreeNode root){
    if(root==null) return;
    traversal(root.left);
    if(pre==null) count=1;
    else if(root.val==pre.val) count++;
    else count=1;
    pre=root;
    if(count==maxCount) res.add(root.val);
    if(count>maxCount){
      maxCount=count;
      res.clear();
      res.add(root.val);
    }
    traversal(root.right);
    return;
  }
  public int[] findMode(TreeNode root) {
    traversal(root);
    int[] result=new int[res.size()];
    for(int i=0;i<result.length;i++){
      result[i]=res.get(i);
    }
    return result;
  }
}
