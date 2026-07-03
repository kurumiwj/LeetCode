package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0111 {

}
class Solution {
  public int minDepth(TreeNode root) {
    if(root==null) return 0;
    if(root.left!=null&&root.right==null) return 1+minDepth(root.left);
    if(root.left==null&&root.right!=null) return 1+minDepth(root.right);
    return 1+Integer.min(minDepth(root.left), minDepth(root.right));
  }
}
