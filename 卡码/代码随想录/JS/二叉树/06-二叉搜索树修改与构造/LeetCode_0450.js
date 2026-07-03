//450. 删除二叉搜索树中的节点
import TreeNode from "../TreeNode.js"

const deleteNode = function(root, key) {
  if(!root) return null;
  if(key<root.val) root.left=deleteNode(root.left,key);
  else if(key>root.val) root.right=deleteNode(root.right,key);
  else{
    if(!root.left&&!root.right) return null;
    else if(root.left&&!root.right) return root.left;
    else if(!root.left&&root.right) return root.right;
    else{
      let parent=root;
      let tmp=root.right;
      while(tmp.left){
        parent=tmp;
        tmp=tmp.left;
      }
      root.val=tmp.val;
      if(parent==root) parent.right=tmp.right;
      else parent.left=tmp.right;
    }
  }
  return root;
};