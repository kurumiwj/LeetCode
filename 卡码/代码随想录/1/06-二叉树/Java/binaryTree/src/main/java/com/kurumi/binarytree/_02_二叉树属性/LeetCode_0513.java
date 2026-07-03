//513. 找树左下角的值
package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_0513 {

}
class Solution {
  int maxDepth=-1;
  int res;
  public void traversal(TreeNode root,int depth){
    if(root.left==null&&root.right==null){
      if(depth>maxDepth){
        maxDepth=depth;
        res=root.val;
      }
      return;
    }
    if(root.left!=null) traversal(root.left,depth+1);
    if(root.right!=null) traversal(root.right, depth+1);
    return;
  }
  public int findBottomLeftValue(TreeNode root) {
    traversal(root, 0);
    return res;
  }
//  public int findBottomLeftValue(TreeNode root) {
//    Queue<TreeNode> q=new LinkedList<>();
//    if(root!=null) q.offer(root);
//    int res=0;
//    while(!q.isEmpty()){
//      int size=q.size();
//      for(int i=0;i<size;i++){
//        TreeNode node = q.poll();
//        if(i==0) res=node.val;
//        if(node.left!=null) q.offer(node.left);
//        if(node.right!=null) q.offer(node.right);
//      }
//    }
//    return res;
  }
}
