//111. 二叉树的最小深度
import TreeNode from "../TreeNode.js";

const minDepth = function(root) {
  if(!root) return 0;
  if(root.left&&!root.right) return 1+minDepth(root.left);
  if(!root.left&&root.right) return 1+minDepth(root.right);
  return 1+Math.min(minDepth(root.left),minDepth(root.right));
};