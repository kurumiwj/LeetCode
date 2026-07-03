//222. 完全二叉树的节点个数
package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0222 {

}
class Solution {
  public int countNodes(TreeNode root) {
    if(root==null) return 0;
    TreeNode left=root.left;
    TreeNode right=root.right;
    int leftDepth=0,rightDepth=0;
    while(left!=null){
      left=left.left;
      leftDepth++;
    }
    while(right!=null){
      right=right.right;
      rightDepth++;
    }
    if(leftDepth==rightDepth) return (2<<leftDepth)-1;
    return 1+countNodes(root.left)+countNodes(root.right);
  }
}
