//111. 二叉树的最小深度
package com.kurumi.binarytree._01_二叉树遍历方式;

import com.kurumi.binarytree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_0111 {

}
class Solution {
  public int minDepth(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    int depth = 0;
    if (root != null) {
      q.offer(root);
    }
    while (!q.isEmpty()) {
      int size = q.size();
      depth++;
      while (size-- > 0) {
        TreeNode node = q.poll();
        if (node.left != null) {
          q.offer(node.left);
        }
        if (node.right != null) {
          q.offer(node.right);
        }
        //叶子节点
        if(node.left==null&&node.right==null) return depth;
      }
    }
    return depth;
  }
}
