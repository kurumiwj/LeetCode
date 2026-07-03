//112. 路径总和
import TreeNode from "../TreeNode.js";

const hasPathSum = function(root, targetSum) {
  if(!root) return false;
  //如果当前节点是叶子节点且目标和与叶子节点值相等则找到路径
  if(!root.left&&!root.right&&targetSum==root.val) return true;
  return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
};