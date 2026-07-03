//226. 翻转二叉树
package com.kurumi.binarytree._03_二叉树修改与构造;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0226 {

}
class Solution {
  public TreeNode invertTree(TreeNode root) {
    if(root==null) return root;
    swap(root);
    invertTree(root.left);
    invertTree(root.right);
    return root;
  }
  public void swap(TreeNode root){
    TreeNode tmp=root.left;
    root.left=root.right;
    root.right=tmp;
  }
}
