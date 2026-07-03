//235. 二叉搜索树的最近公共祖先
package com.kurumi.binarytree._05_二叉树公共祖先;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0235 {

}
class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while(root!=null){
      if(root.val>p.val&&root.val>q.val) root=root.left;
      else if(root.val<p.val&&root.val<q.val) root=root.right;
      else return root;
    }
    return null;
  }
}
