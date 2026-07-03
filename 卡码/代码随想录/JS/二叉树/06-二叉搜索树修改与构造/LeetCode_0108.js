//108. 将有序数组转换为二叉搜索树
import TreeNode from "../TreeNode.js"

const traversal=(nums,left,right)=>{
  if(left>right) return null;
  const mid=Math.floor((left+right)/2);
  const root=new TreeNode(nums[mid]);
  root.left=traversal(nums,left,mid-1);
  root.right=traversal(nums,mid+1,right);
  return root;
};

const sortedArrayToBST = function(nums) {
  return traversal(nums,0,nums.length-1);
};