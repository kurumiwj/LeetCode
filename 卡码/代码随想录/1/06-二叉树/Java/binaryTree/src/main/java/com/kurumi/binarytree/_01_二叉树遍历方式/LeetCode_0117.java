//117. 填充每个节点的下一个右侧节点指针 II
package com.kurumi.binarytree._01_二叉树遍历方式;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_0117 {

}
class Node {
  public int val;
  public Node left;
  public Node right;
  public Node next;
  public Node() {
  }
  public Node(int _val) {
    val = _val;
  }
  public Node(int _val, Node _left, Node _right, Node _next) {
    val = _val;
    left = _left;
    right = _right;
    next = _next;
  }
};

class Solution {
  public Node connect(Node root) {
    Queue<Node> q = new LinkedList<>();
    Node pre = null, cur = null;
    if (root != null) {
      q.offer(root);
    }
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        cur = q.poll();
        if (i != 0) {
          pre.next = cur;
        }
        pre = cur;
        if (cur.left != null) {
          q.offer(cur.left);
        }
        if (cur.right != null) {
          q.offer(cur.right);
        }
      }
      cur.next = null;
    }
    return root;
  }
}
