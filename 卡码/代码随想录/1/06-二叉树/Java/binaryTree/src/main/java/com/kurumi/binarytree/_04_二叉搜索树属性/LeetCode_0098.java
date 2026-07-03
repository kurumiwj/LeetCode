//98. 验证二叉搜索树
package com.kurumi.binarytree._04_二叉搜索树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0098 {

}
class Solution {
  TreeNode pre=null;
  public boolean isValidBST(TreeNode root) {
    if(root==null) return true;
    boolean left=isValidBST(root.left);
    if(pre!=null&&pre.val>=root.val) return false;
    pre=root;
    boolean right=isValidBST(root.right);
    return left&&right;
  }
}
