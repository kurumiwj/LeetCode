//199. 二叉树的右视
import TreeNode from "../TreeNode.js";

const rightSideView = function(root) {
  const res=new Array();
  const q=new Array();
  let size=0;
  if(root) q.push(root);
  while(q.length>0){
    size=q.length;
    for(let i=0;i<size;i++){
      const node=q.shift();
      if(i==size-1) res.push(node.val);
      if(node.left) q.push(node.left);
      if(node.right) q.push(node.right);
    }
  }
  return res;
};