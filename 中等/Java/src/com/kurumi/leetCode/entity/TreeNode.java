package com.kurumi.leetCode.entity;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:10:00
 * @Description TreeNode
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
