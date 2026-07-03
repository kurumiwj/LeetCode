//404. 左叶子之和
package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0404 {

}
class Solution {
  public int sumOfLeftLeaves(TreeNode root) {
    if(root==null) return 0;
    int leftSum=0;
    if(root.left!=null&&root.left.left==null&&root.left.right==null) leftSum=root.left.val;
    return leftSum+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
  }
}
