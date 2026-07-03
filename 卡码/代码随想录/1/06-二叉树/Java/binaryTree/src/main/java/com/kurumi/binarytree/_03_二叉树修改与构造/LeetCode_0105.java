//105. 从前序与中序遍历序列构造二叉树
package com.kurumi.binarytree._03_二叉树修改与构造;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0105 {

}
class Solution {
  public TreeNode traversal(int[] inOrder, int inLeft, int inRight, int[] preOrder, int preLeft, int preRight) {
    if (inRight < inLeft) return null;
    TreeNode root = new TreeNode(preOrder[preLeft]);
    if (inRight == inLeft) {
      return root;
    }
    int rootIndex = 0;
    for (int i = inLeft; i <= inRight; i++) {
      if (inOrder[i] == root.val) {
        rootIndex = i;
        break;
      }
    }
    int leftLength = rootIndex - inLeft;
    root.left = traversal(inOrder, inLeft, rootIndex - 1, preOrder, preLeft+1, preLeft + leftLength);
    root.right = traversal(inOrder, rootIndex + 1, inRight, preOrder, preLeft+1+leftLength, preRight);
    return root;
  }
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if(preorder.length==0||inorder.length==0) return null;
    return traversal(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
  }
}
