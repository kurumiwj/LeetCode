//100. 相同的树
package com.kurumi.binarytree._02_二叉树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0100 {

}
class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null&&q!=null) return false;
    else if(p!=null&&q==null) return false;
    else if(p==null&&q==null) return true;
    else if(p.val!=q.val) return false;
    else return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
  }
}
