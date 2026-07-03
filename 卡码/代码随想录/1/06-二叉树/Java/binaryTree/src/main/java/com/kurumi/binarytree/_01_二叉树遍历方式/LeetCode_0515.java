//515. 在每个树行中找最大值
package com.kurumi.binarytree._01_二叉树遍历方式;

import com.kurumi.binarytree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode_0515 {

}
class Solution {
  public List<Integer> largestValues(TreeNode root) {
    List<Integer> res=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    if(root!=null) q.offer(root);
    while(!q.isEmpty()){
      int size=q.size();
      int max=q.peek().val;
      while(size-->0){
        TreeNode node = q.poll();
        max=max>node.val ? max : node.val;
        if(node.left!=null) q.offer(node.left);
        if(node.right!=null) q.offer(node.right);
      }
      res.add(max);
    }
    return res;
  }
}
