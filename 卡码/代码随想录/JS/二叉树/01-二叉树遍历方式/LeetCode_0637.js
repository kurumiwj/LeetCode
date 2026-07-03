//637. 二叉树的层平均值
import TreeNode from "../TreeNode.js";

const averageOfLevels = function(root) {
  const res=new Array();
  const q=new Array();
  let size=0,sum=0;
  if(root) q.push(root);
  while(q.length>0){
    size=q.length;
    sum=0;
    for(let i=0;i<size;i++){
      let node=q.shift();
      sum+=node.val;
      if(node.left) q.push(node.left);
      if(node.right) q.push(node.right);
    }
    res.push(sum/size);
  }
  return res;
};