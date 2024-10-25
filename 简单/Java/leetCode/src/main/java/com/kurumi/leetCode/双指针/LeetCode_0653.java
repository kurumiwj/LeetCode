package com.kurumi.leetCode.双指针;


import com.kurumi.leetCode.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2024年10月25日 下午7:46:32
 * @Description 653. 两数之和 IV - 输入二叉搜索树
 */
public class LeetCode_0653 {
    List<Integer> list = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        inOrder(root);
        // 如果节点个数不满2个则一定找不到
        if (list.size() < 2) return false;
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == k) return true;
            else if (sum < k) {
                ++left;
            } else {
                --right;
            }
        }
        return false;
    }
    
    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
