//102. 二叉树的层序遍历
package com.kurumi.binarytree._01_二叉树遍历方式;

import com.kurumi.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_0102 {

}
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res=new ArrayList();
    Queue<TreeNode> queue=new LinkedList<>();
    int size=0;
    if(root!=null) queue.offer(root);
    while(queue.size()>0){
      size=queue.size();
      List<Integer> v = new ArrayList<>();
      while(size-->0){
        TreeNode node=queue.peek();
        queue.poll();
        v.add(node.val);
        if(node.left!=null) queue.offer(node.left);
        if(node.right!=null) queue.offer(node.right);
      }
      res.add(v);
    }
    return res;
  }
}
