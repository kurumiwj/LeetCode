//107. 二叉树的层序遍历 II
package com.kurumi.binarytree._01_二叉树遍历方式;

import com.kurumi.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_0107 {

}
class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> res=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    int size;
    if(root!=null) q.offer(root);
    while(!q.isEmpty()){
      size=q.size();
      List<Integer> v=new ArrayList();
      while(size-->0){
        TreeNode node=q.poll();
        v.add(node.val);
        if(node.left!=null) q.offer(node.left);
        if(node.right!=null) q.offer(node.right);
      }
      res.add(0,v);
    }
    return res;
  }
}
