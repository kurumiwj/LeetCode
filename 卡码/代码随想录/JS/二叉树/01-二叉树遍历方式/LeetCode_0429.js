//429. N 叉树的层序遍历
function Node(val,children) {
  this.val = val;
  this.children = children;
};

const levelOrder = function(root) {
  const res=new Array();
  const q=new Array();
  if(root) q.push(root);
  while(q.length>0){
    let size=q.length;
    let v=new Array();
    while(size-->0){
      const node=q.shift();
      v.push(node.val);
      for(let child of node.children) q.push(child);
    }
    res.push(v);
  }
  return res;
};