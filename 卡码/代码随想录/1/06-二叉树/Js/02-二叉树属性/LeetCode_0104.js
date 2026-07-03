//104. 二叉树的最大深度
import TreeNode from "../TreeNode.js";

const maxDepth = function(root) {
  if(!root) return 0;
  return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
};