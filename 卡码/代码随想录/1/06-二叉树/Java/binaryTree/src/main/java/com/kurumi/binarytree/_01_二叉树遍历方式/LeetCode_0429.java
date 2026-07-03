//429. N 叉树的层序遍历
package com.kurumi.binarytree._01_二叉树遍历方式;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_0429 {

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
  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> res=new ArrayList<>();
    Queue<Node> q=new LinkedList<>();
    if(root!=null) q.offer(root);
    while(!q.isEmpty()){
      int size=q.size();
      List<Integer> v=new ArrayList<>();
      while(size-->0){
        Node node = q.poll();
        v.add(node.val);
//        node.children.stream().forEach(item->{q.offer(item);});
        for(Node tmp:node.children){
          if(tmp!=null) q.offer(tmp);
        }
      }
      res.add(v);
    }
    return res;
  }
}
