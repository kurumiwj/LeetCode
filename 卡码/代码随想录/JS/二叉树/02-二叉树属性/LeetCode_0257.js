//257. 二叉树的所有路径
import TreeNode from "../TreeNode.js";

const traversal=(root,path,res)=>{
  path+=root.val;
  //找到叶子节点
  if(!root.left&&!root.right){
    res.push(path);
    return;
  }
  if(root.left) traversal(root.left,path+"->",res);
  if(root.right) traversal(root.right,path+"->",res);
}
const binaryTreePaths = function(root) {
  const res=new Array();
  let path="";
  if(!root) return res;
  traversal(root,path,res);
  return res;
};