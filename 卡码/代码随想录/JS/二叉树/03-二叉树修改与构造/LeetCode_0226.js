//226. 翻转二叉树
import TreeNode from "../TreeNode.js";

const invertTree = function(root) {
  if(!root) return root;
  [root.left,root.right]=[root.right,root.left];
  invertTree(root.left);
  invertTree(root.right);
  return root;
};