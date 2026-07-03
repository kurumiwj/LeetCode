//654. 最大二叉树
import TreeNode from "../TreeNode.js";

const traversal=(nums,left,right)=>{
  if(left>=right) return null;
  let maxIndex=left;
  for(let i=left;i<right;i++){
    if(nums[i]>nums[maxIndex]) maxIndex=i;
  }
  const root=new TreeNode(nums[maxIndex]);
  root.left=traversal(nums,left,maxIndex);
  root.right=traversal(nums,maxIndex+1,right);
  return root;
};
const constructMaximumBinaryTree = function(nums) {
  return traversal(nums,0,nums.length);
};