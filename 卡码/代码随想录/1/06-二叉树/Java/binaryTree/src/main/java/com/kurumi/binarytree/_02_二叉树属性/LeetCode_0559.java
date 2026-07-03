//559. N 叉树的最大深度
package com.kurumi.binarytree._02_二叉树属性;

import java.util.List;

public class LeetCode_0559 {

}
class Node {
  public int val;
  public List<Node> children;
  public Node() {
  }
  public Node(int _val) {
    val = _val;
  }
  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }
};
class Solution {
  public int maxDepth(Node root) {
    if(root==null) return 0;
    int depth=0;
    for(Node node:root.children){
      depth=Integer.max(depth,maxDepth(node));
    }
    return 1+depth;
  }
}
