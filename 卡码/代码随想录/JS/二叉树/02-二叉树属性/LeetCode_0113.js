//113. 路径总和 II
import TreeNode from "../TreeNode.js";

let res=new Array();
let path=new Array();
const traversal=function(root,sum){
  if(!root) return;
  path.push(root.val);
  //叶子节点且sum等于当前节点值说明找到路径
  if(!root.left&&!root.right&&sum==root.val) res.push([...path]);
  traversal(root.left,sum-root.val);
  traversal(root.right,sum-root.val);
  path.pop();
}
const pathSum = function(root, targetSum) {
  res=[];
  path=[];
  traversal(root,targetSum);
  return res;
};