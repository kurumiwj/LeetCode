//236. 二叉树的最近公共祖先
import TreeNode from "../TreeNode.js"

const lowestCommonAncestor = function(root, p, q) {
  if(!root||root==p||root==q) return root;
  const left=lowestCommonAncestor(root.left,p,q);
  const right=lowestCommonAncestor(root.right,p,q);
  if(left&&right) return root;
  else if(!left&&right) return right;
  else if(left&&!right) return left;
  else return null;
};