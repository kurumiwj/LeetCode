//572. 另一棵树的子树
import TreeNode from "../TreeNode.js";

const compare=(left,right)=>{
  if(left&&!right) return false;
  else if(!left&&right) return false;
  else if(!left&&!right) return true;
  else if(left.val!=right.val) return false;
  else return compare(left.left,right.left)&&compare(left.right,right.right);
};

const isSubtree = function(root, subRoot) {
  if(!root) return false;
  return compare(root,subRoot)||isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
};