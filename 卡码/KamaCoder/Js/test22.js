//22. 二叉树的遍历
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const out=process.stdout;

class Node{
  nodes=new Array();
  constructor(data,left,right){
    this.data=data;
    this.left=left;
    this.right=right;
  }
  preOrder(){
    out.write(this.data);
    if(this.left!==0) Node.nodes[this.left].preOrder();
    if(this.right!==0) Node.nodes[this.right].preOrder();
  }
  inOrder(){
    if(this.left!==0) Node.nodes[this.left].inOrder();
    out.write(this.data);
    if(this.right!==0) Node.nodes[this.right].inOrder();
  }
  postOrder(){
    if(this.left!==0) Node.nodes[this.left].postOrder();
    if(this.right!==0) Node.nodes[this.right].postOrder();
    out.write(this.data);
  }
}

async function main(){
  const n=parseInt(await readline());
  Node.nodes=new Array(n+1);
  for(let i=1;i<=n;i++){
    let line=(await readline()).split(" ");
    let left=parseInt(line[1]);
    let right=parseInt(line[2]);
    Node.nodes[i]=new Node(line[0],left,right);
  }
  Node.nodes[1].preOrder();
  console.log();
  Node.nodes[1].inOrder();
  console.log();
  Node.nodes[1].postOrder();
}

main();