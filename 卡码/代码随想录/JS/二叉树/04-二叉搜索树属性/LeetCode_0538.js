//538. 把二叉搜索树转换为累加树
import TreeNode from "../TreeNode.js"

const convertBST = function(root) {
  let pre=0;
  const traversal=root=>{
    if(!root) return;
    traversal(root.right);
    root.val+=pre;
    pre=root.val;
    traversal(root.left);
  }
  traversal(root);
  return root;
};