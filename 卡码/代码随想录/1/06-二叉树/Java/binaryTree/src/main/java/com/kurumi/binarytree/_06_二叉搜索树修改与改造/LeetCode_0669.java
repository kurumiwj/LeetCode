//669. 修剪二叉搜索树
package com.kurumi.binarytree._06_二叉搜索树修改与改造;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0669 {

}
class Solution {
  public TreeNode trimBST(TreeNode root, int low, int high) {
    if(root==null) return null;
    if(root.val<low) return trimBST(root.right, low, high);
    else if(root.val>high) return trimBST(root.left, low, high);
    else{
      root.left=trimBST(root.left, low, high);
      root.right=trimBST(root.right, low, high);
    }
    return root;
  }
}
