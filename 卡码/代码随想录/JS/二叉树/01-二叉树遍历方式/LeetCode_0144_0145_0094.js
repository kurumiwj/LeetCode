//144-145-94.二叉树的前/后/中序遍历
import TreeNode from "../TreeNode.js";

//先序遍历
const preorderTraversal = function(root) {
  let res=new Array();
  preOrder(root,res);
  return res;
};
const preOrder=(root,res)=>{
  if(root==null) return;
  res.push(root.val);
  preOrder(root.left,res);
  preOrder(root.right,res);
};
//中序遍历
const inorderTraversal=function(root){
  const res=new Array();
  inOrder(root,res);
  return res;
};
const inOrder=(root,res)=>{
  if(root==null) return;
  inOrder(root.left,res);
  res.push(root.val);
  inOrder(root.right,res);
};
//后序遍历
const postorderTraversal=function(root){
  const res=new Array();
  postOrder(root,res);
  return res;
};
const postOrder=(root,res)=>{
  if(root==null) return;
  postOrder(root.left,res);
  postOrder(root.right,res);
  res.push(root.val);
};