//102. 二叉树的层序遍历
import TreeNode from "../TreeNode.js";

const levelOrder = function(root) {
  const res=new Array();
  const queue=new Array();
  if(root) queue.push(root);
  while(queue.length>0){
    let size=queue.length;
    const v=new Array();
    while(size-->0){
      let node=queue.shift();
      v.push(node.val);
      if(node.left) queue.push(node.left);
      if(node.right) queue.push(node.right);
    }
    res.push(v);
  }
  return res;
};