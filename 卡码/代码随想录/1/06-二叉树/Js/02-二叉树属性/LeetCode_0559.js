//559. N 叉树的最大深度
function Node(val,children) {
  this.val = val;
  this.children = children;
};

const maxDepth = function(root) {
  if(!root) return 0;
  let depth=0;
  for(let node of root.children){
    depth=Math.max(depth,maxDepth(node));
  }
  return 1+depth;
};