//110. 平衡二叉树
import TreeNode from "../TreeNode.js";

const getHeight=root=>{
  if(!root) return 0;
  const leftHeight=getHeight(root.left),rightHeight=getHeight(root.right);
  if(leftHeight==-1||rightHeight==-1) return -1;
  return Math.abs(leftHeight-rightHeight)>1 ? -1 : 1+Math.max(leftHeight,rightHeight);
};
const isBalanced = function(root) {
  return getHeight(root)==-1 ? false : true;
};