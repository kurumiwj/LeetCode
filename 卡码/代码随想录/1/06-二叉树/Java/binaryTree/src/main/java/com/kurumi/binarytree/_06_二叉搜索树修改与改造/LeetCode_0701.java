//701. 二叉搜索树中的插入操作
package com.kurumi.binarytree._06_二叉搜索树修改与改造;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0701 {

}
class Solution {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if(root==null) return new TreeNode(val);
    if(val<root.val) root.left=insertIntoBST(root.left, val);
    else if(val>root.val) root.right=insertIntoBST(root.right, val);
    return root;
  }
}
