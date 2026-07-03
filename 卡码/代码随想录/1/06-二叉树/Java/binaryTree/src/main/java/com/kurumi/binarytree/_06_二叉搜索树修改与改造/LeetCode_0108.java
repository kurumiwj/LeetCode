//108. 将有序数组转换为二叉搜索树
package com.kurumi.binarytree._06_二叉搜索树修改与改造;

import com.kurumi.binarytree.TreeNode;

public class LeetCode_0108 {

}
class Solution {
  public TreeNode traversal(int[] nums,int left,int right){
    if(left>right) return null;
    int mid=(left+right)/2;
    TreeNode root=new TreeNode(nums[mid]);
    root.left=traversal(nums, left, mid-1);
    root.right=traversal(nums, mid+1, right);
    return root;
  }
  public TreeNode sortedArrayToBST(int[] nums) {
    return traversal(nums, 0, nums.length-1);
  }
}
