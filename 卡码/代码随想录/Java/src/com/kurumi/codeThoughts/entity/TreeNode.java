package com.kurumi.codeThoughts.entity;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description TreeNode
 */
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;
  public TreeNode() {
  }
  public TreeNode(int val) {
    this.val = val;
  }
  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
