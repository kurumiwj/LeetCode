//538. 把二叉搜索树转换为累加树
package com.kurumi.binarytree._04_二叉搜索树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0538 {

}
class Solution {
  int pre=0;
  public void traversal(TreeNode root){
    if(root==null) return;
    traversal(root.right);
    root.val+=pre;
    pre=root.val;
    traversal(root.left);
  }
  public TreeNode convertBST(TreeNode root) {
    pre=0;
    traversal(root);
    return root;
  }
}
