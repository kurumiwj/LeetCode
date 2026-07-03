//111. 二叉树的最小深度
import TreeNode from "../TreeNode.js";

const minDepth = function(root) {
  q=new Array();
  let depth=0;
  if(root) q.push(root);
  while(q.length>0){
    let size=q.length;
    depth++;
    while(size-->0){
      const node=q.shift();
      if(node.left) q.push(node.left);
      if(node.right) q.push(node.right);
      if(!node.left&&!node.right) return depth;
    }
  }
  return depth;
};