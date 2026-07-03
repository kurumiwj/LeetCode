//404. 左叶子之和
import TreeNode from "../TreeNode.js";

const sumOfLeftLeaves = function(root) {
  if(!root) return 0;
  let leftSum=0;
  if(root.left&&!root.left.left&&!root.left.right) leftSum=root.left.val;
  return leftSum+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
};