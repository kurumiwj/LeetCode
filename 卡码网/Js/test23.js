//23. 二叉树的高度
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
  getHeight(){
    let leftHeight=0,rightHeight=0;
    if(this.left!=null) leftHeight=this.left.getHeight();
    if(this.right!=null) rightHeight=this.right.getHeight();
    return Math.max(leftHeight,rightHeight)+1;
  }
  static createTree(preOrder,inOrder,preLeft,preRight,inLeft,inRight){
    if(preLeft>preRight||inLeft>inRight) return null;
    let rootIndex=inOrder.indexOf(preOrder[preLeft]);
    let root=new Node(preOrder[preLeft]);
    let leftNum=rootIndex-inLeft;
    root.left=Node.createTree(preOrder,inOrder,preLeft+1,preLeft+leftNum,inLeft,rootIndex-1);
    root.right=Node.createTree(preOrder,inOrder,preLeft+1+leftNum,preRight,rootIndex+1,inRight);
    return root;
  }
}

async function main(){
  while(line=await readline()){
    n=parseInt(line);
    let preOrder=await readline();
    let inOrder=await readline();
    let root=Node.createTree(preOrder,inOrder,0,n-1,0,n-1);
    console.log(root.getHeight());
  }
}

main();