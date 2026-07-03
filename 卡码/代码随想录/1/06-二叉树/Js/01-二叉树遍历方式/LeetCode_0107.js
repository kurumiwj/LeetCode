//107. 二叉树的层序遍历 II
import TreeNode from "../TreeNode.js";

const levelOrderBottom = function(root) {
  const res=new Array();
  const queue=new Array();
  let size=0;
  if(root) queue.push(root);
  while(queue.length>0){
    size=queue.length;
    const v=new Array();
    while(size-->0){
      const node=queue.shift();
      v.push(node.val);
      if(node.left) queue.push(node.left);
      if(node.right) queue.push(node.right);
    }
    res.unshift(v);
  }
  return res;
};