//104. 二叉树的最大深度
package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0104 {

}
class Solution {
  public int maxDepth(TreeNode root) {
    if(root==null) return 0;
    return 1+Integer.max(maxDepth(root.left),maxDepth(root.right));
  }
}
