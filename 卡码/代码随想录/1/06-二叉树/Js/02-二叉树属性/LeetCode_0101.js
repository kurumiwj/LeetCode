//101. 对称二叉树
import TreeNode from "../TreeNode.js";

const compare=(left,right)=>{
  if(left&&!right) return false;
  else if(!left&&right) return false;
  else if(!left&&!right) return true;
  else if(left.val!=right.val) return false;
  else return compare(left.left,right.right)&&compare(left.right,right.left);
};

const isSymmetric = function(root) {
  if(!root) return false;
  return compare(root.left,root.right);
};