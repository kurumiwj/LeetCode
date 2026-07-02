package com.kurumi.top100.二叉树;

import java.util.HashMap;
import java.util.Map;

import com.kurumi.top100.entity.TreeNode;
import com.kurumi.top100.utils.TreeNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午6:33:06
 * @Description 105. 从前序与中序遍历序列构造二叉树
 */
public class LeetCode_0105 {
    static class Solution {
        private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        private TreeNode buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
            if (inStart > inEnd || preStart > preEnd) return null;
            TreeNode root = new TreeNode(preOrder[preStart]);
            int mid = map.get(preOrder[preStart]);
            int leftLength = mid - inStart;
            root.left = buildTree(preOrder, preStart + 1, preStart + leftLength, inOrder, inStart, mid - 1);
            root.right = buildTree(preOrder, preStart + leftLength + 1, preEnd, inOrder, mid + 1, inEnd);
            return root;
        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNodeUtils.printWithNull(solution.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7}));
    }
}
