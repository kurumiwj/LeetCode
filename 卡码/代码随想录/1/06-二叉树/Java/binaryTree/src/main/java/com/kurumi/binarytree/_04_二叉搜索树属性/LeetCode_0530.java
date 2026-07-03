//530. 二叉搜索树的最小绝对差
package com.kurumi.binarytree._04_二叉搜索树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0530 {

}
class Solution {
  TreeNode pre=null;
  int res=Integer.MAX_VALUE;
  public void traversal(TreeNode root){
    if(root==null) return;
    traversal(root.left);
    if(pre!=null) res=Integer.min(res, root.val-pre.val);
    pre=root;
    traversal(root.right);
  }
  public int getMinimumDifference(TreeNode root) {
    traversal(root);
    return res;
  }
}
