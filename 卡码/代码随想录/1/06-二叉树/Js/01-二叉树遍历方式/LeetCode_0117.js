//117. 填充每个节点的下一个右侧节点指针 II
function Node(val, left, right, next) {
  this.val = val === undefined ? null : val;
  this.left = left === undefined ? null : left;
  this.right = right === undefined ? null : right;
  this.next = next === undefined ? null : next;
};

const connect = function(root) {
  const q=new Array();
  let pre,cur;
  if(root) q.push(root);
  while(q.length>0){
    let size=q.length;
    for(let i=0;i<size;i++){
      cur=q.shift();
      if(i!=0) pre.next=cur;
      pre=cur;
      if(cur.left) q.push(cur.left);
      if(cur.right) q.push(cur.right);
    }
  }
  return root;
};