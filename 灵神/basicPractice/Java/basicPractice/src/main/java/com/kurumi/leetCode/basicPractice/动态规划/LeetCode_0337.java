package com.kurumi.leetCode.basicPractice.动态规划;

import java.util.Arrays;

import com.kurumi.leetCode.basicPractice.entity.TreeNode;
import com.kurumi.leetCode.basicPractice.utils.TreeNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-07-08 下午2:24:29
 * @Description 337. 打家劫舍 III
 */
public class LeetCode_0337 {
    static class Solution {
        // 0—不偷，1—偷
        private int[] dfs(TreeNode root) {
            if (root == null) return new int[] {0, 0};
            int[] left = dfs(root.left);
            int[] right = dfs(root.right);
            return new int[] {Math.max(left[0], left[1]) + Math.max(right[0], right[1]), left[0] + right[0] + root.val};
        }

        public int rob(TreeNode root) {
            int[] res = dfs(root);
            return Math.max(res[0], res[1]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(TreeNodeUtils.init(Arrays.asList(3,2,3,null,3,null,1))));
    }
}
