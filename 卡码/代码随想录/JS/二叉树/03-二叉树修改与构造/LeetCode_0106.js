//106. 从中序与后序遍历序列构造二叉树
import TreeNode from "../TreeNode.js";

const traversal=function(inOrder,inLeft,inRight,postOrder,postLeft,postRight){
  if(inLeft>inRight) return null;
  const root=new TreeNode(postOrder[postRight],null,null);
  if(inLeft==inRight) return root;
  let rootIndex=0;
  for(let i=inLeft;i<=inRight;i++){
    if(inOrder[i]==root.val){
      rootIndex=i;
      break;
    }
  }
  const leftLength=rootIndex-inLeft;
  root.left=traversal(inOrder,inLeft,rootIndex-1,postOrder,postLeft,postLeft+leftLength-1);
  root.right=traversal(inOrder,rootIndex+1,inRight,postOrder,postLeft+leftLength,postRight-1);
  return root;
}

const buildTree = function(inorder, postorder) {
  if(inorder.length==0||postorder.length==0) return null;
  return traversal(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
};