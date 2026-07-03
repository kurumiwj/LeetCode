//21. 构造二叉树
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;

const out=process.stdout;

class Node{
  constructor(data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
  postOrder(){
    if(this.left!=null) this.left.postOrder();
    if(this.right!=null) this.right.postOrder();
    out.write(this.data);
  }
}

function createBTree(preOrder,inOrder,preLeft,preRight,inLeft,inRight){
  if(preLeft>preRight||inLeft>inRight) return null;
  let root=new Node(preOrder[preLeft]);
  let rootIndex=inOrder.indexOf(preOrder[preLeft]);
  let leftNum=rootIndex-inLeft;
  let rightNum=inRight-rootIndex;
  root.left=createBTree(preOrder,inOrder,preLeft+1,preLeft+leftNum,inLeft,rootIndex-1);
  root.right=createBTree(preOrder,inOrder,preLeft+leftNum+1,preRight,rootIndex+1,inRight);
  return root;
}

async function main(){
  while(line=await readline()){
    [preOrder,inOrder]=line.split(" ");
    const root=createBTree(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
    root.postOrder();
    console.log();
  }
}

main();