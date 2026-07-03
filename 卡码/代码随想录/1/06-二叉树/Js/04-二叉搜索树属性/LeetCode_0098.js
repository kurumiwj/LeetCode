//98. 验证二叉搜索树
import TreeNode from "../TreeNode.js"

const isValidBST = function(root) {
  let pre=null;
  const traversal=node=>{
    if(!node) return true;
    const left=traversal(node.left);
    if(pre&&pre.val>=node.val) return false;
    pre=node;
    const right=traversal(node.right);
    return left&&right;
  }
  return traversal(root);
};