//530. 二叉搜索树的最小绝对差
import TreeNode from "../TreeNode.js"

const getMinimumDifference = function(root) {
  let res=Infinity;
  let pre=null;
  const traversal=node=>{
    if(!node) return;
    traversal(node.left);
    if(pre) res=Math.min(res,node.val-pre.val);
    pre=node;
    traversal(node.right);
  };
  traversal(root);
  return res;
};