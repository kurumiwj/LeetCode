//700. 二叉搜索树中的搜索
import TreeNode from "../TreeNode.js";

const searchBST = function(root, val) {
  while(root){
    if(val<root.val) root=root.left;
    else if(val>root.val) root=root.right;
    else return root;
  }
  return null;
};