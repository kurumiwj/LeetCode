//515. 在每个树行中找最大值
import TreeNode from "../TreeNode.js";
 
const largestValues = function(root) {
  const res=new Array();
  const q=new Array();
  if(root) q.push(root);
  while(q.length>0){
    let size=q.length;
    let max=q[0].val;
    while(size-->0){
      const node=q.shift();
      max=max<node.val ? node.val : max;
      if(node.left) q.push(node.left);
      if(node.right) q.push(node.right);
    }
    res.push(max);
  }
  return res;
};