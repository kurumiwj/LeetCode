//101. 对称二叉树
package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0101 {

}
class Solution {
  public boolean compare(TreeNode left,TreeNode right){
    if(left==null&&right!=null) return false;
    else if(left!=null&&right==null) return false;
    else if(left==null&&right==null) return true;
    else if(left.val!=right.val) return false;
    else return compare(left.left, right.right)&&compare(left.right, right.left);
  }
  public boolean isSymmetric(TreeNode root) {
    if(root==null) return true;
    else return compare(root.left,root.right);
  }
}
