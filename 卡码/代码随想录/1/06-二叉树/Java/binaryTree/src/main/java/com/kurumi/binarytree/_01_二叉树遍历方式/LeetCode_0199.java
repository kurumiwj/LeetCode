//199. 二叉树的右视
package com.kurumi.binarytree._01_二叉树遍历方式;

import com.kurumi.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_0199 {

}
class Solution {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    if(root!=null) q.offer(root);
    int size;
    while(!q.isEmpty()){
      size=q.size();
      for(int i=0;i<size;i++){
        TreeNode node=q.poll();
        if(i==size-1) res.add(node.val);
        if(node.left!=null) q.offer(node.left);
        if(node.right!=null) q.offer(node.right);
      }
    }
    return res;
  }
}
