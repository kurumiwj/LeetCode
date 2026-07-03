//513. 找树左下角的值
import TreeNode from "../TreeNode.js";

let maxDepth=-1,res=0;
const traversal=(root,depth)=>{
  if(!root.left&&!root.right){
    if(depth>maxDepth){
      maxDepth=depth;
      res=root.val;
    }
    return;
  }
  root.left&&traversal(root.left,depth+1);
  root.right&&traversal(root.right,depth+1);
  return;
};
const findBottomLeftValue = function(root) {
  maxDepth=-1,res=0;
  traversal(root,0);
  return res;
};

//const findBottomLeftValue = function(root) {
//  const q=new Array();
//  if(root) q.push(root);
//  let res=0;
//  while(q.length>0){
//    const size=q.length;
//    for(let i=0;i<size;i++){
//      const node=q.shift();
//      if(i==0) res=node.val;
//      node.left&&q.push(node.left);
//      node.right&&q.push(node.right);
//    }
//  }
//  return res;
//};