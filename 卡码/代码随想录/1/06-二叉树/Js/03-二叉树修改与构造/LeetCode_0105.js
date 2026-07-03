//105. 从前序与中序遍历序列构造二叉树
import TreeNode from "../TreeNode.js";

const traversal=function(preOrder,preLeft,preRight,inOrder,inLeft,inRight){
  if(inLeft>inRight) return null;
  const root=new TreeNode(preOrder[preLeft],null,null);
  if(inLeft==inRight) return root;
  let rootIndex=0;
  for(let i=inLeft;i<=inRight;i++){
    if(inOrder[i]==root.val){
      rootIndex=i;
      break;
    }
  }
  const leftLength=rootIndex-inLeft;
  root.left=traversal(preOrder,preLeft+1,preLeft+leftLength,inOrder,inLeft,rootIndex-1);
  root.right=traversal(preOrder,preLeft+leftLength+1,preRight,inOrder,rootIndex+1,inRight);
  return root;
}

const buildTree = function(preorder, inorder) {
  if(preorder.length==0||inorder.length==0) return null;
  return traversal(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
};