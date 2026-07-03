//235. 二叉搜索树的最近公共祖先
import TreeNode from "../TreeNode.js";

const lowestCommonAncestor = function(root, p, q) {
  while(root){
    if(root.val>p.val&&root.val>q.val) root=root.left;
    else if(root.val<p.val&&root.val<q.val) root=root.right;
    else return root;
  }
  return null;
};