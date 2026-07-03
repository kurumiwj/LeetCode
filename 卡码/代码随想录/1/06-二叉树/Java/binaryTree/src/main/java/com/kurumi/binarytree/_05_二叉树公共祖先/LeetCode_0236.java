//236. 二叉树的最近公共祖先
package com.kurumi.binarytree._05_二叉树公共祖先;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0236 {

}
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==null||root==p||root==q) return root;
    TreeNode left=lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);
    if(left!=null&&right!=null) return root;
    else if(left==null&&right!=null) return right;
    else if(left!=null&&right==null) return left;
    else return null;
  }
}
