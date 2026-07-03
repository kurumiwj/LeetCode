//113. 路径总和 II
package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_0113 {

}
class Solution {
  List<List<Integer>> res=new LinkedList<>();
  LinkedList<Integer> path=new LinkedList<>();
  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    traversal(root, targetSum);
    return res;
  }
  public void traversal(TreeNode root,int sum){
    if(root==null) return;
    path.offer(root.val);
    sum-=root.val;
    //叶子节点且sum减到0说明找到路径
    if(root.left==null&&root.right==null&&sum==0) res.add(new LinkedList<>(path));
    traversal(root.left, sum);
    traversal(root.right, sum);
    path.removeLast();
  }
}
