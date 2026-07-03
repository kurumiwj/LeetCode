//700. 二叉搜索树中的搜索
package com.kurumi.binarytree._04_二叉搜索树属性;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0700 {

}
class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    while(root!=null){
      if(val<root.val) root=root.left;
      else if(val>root.val) root=root.right;
      else return root;
    }
    return null;
  }
}
