//222. 完全二叉树的节点个数
import TreeNode from "../TreeNode.js";

const countNodes = function(root) {
  if(!root) return 0;
  let left=root.left,right=root.right;
  let leftDepth=0,rightDepth=0;
  while(left){
    left=left.left;
    leftDepth++;
  }
  while(right){
    right=right.right;
    rightDepth++;
  }
  if(leftDepth==rightDepth) return (2<<leftDepth)-1;
  return 1+countNodes(root.left)+countNodes(root.right);
};