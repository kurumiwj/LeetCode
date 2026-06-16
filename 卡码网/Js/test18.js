//18. 链表的基本操作
const rl=require("readline").createInterface({input:process.stdin});
const iter=rl[Symbol.asyncIterator]();
const readline=async ()=>(await iter.next()).value;
const out=process.stdout;

class Node{
  constructor(value){
    this.data=value;
    this.length=0;
    this.next=null;
  }
  show(){
    if(this.length===0) out.write("Link list is empty");
    else{
      let tmp=this.next;
      while(tmp){
        if(tmp!=this.next) out.write(" ");
        out.write(tmp.data.toString());
        tmp=tmp.next;
      }
    }
  }
  insert(index,value){
    if(index<1||index>this.length+1) return false;
    let node=new Node(value);
    let i=1;
    if(i===index){
      node.next=this.next;
      this.next=node;
    }else{
      let tmp=this.next;
      while(tmp){
        i++;
        if(i==index) break;
        tmp=tmp.next;
      }
      node.next=tmp.next;
      tmp.next=node;
    }
    this.length++;
    return true;
  }
  deleteNode(index){
    if(index<1||index>this.length||this.length===0) return false;
    let tmp=this.next;
    let i=1;
    if(i===index) this.next=tmp.next;
    else{
      while(tmp){
        i++;
        if(i===index) break;
        tmp=tmp.next;
      }
      tmp.next=tmp.next.next;
    }
    this.length--;
    return true;
  }
  getNode(index){
    if(index<1||index>this.length) return null;
    let i=1;
    if(i===index) return this.next;
    let tmp=this.next;
    while(tmp){
      i++;
      tmp=tmp.next;
      if(i===index){
        return tmp;
      }
    }
  }
}

async function main(){
  const nums=(await readline()).split(" ").map(Number);
  let root=new Node(-1);
  for(let i=1;i<=nums[0];i++){
    root.insert(1,nums[i]);
  }
  const n=parseInt(await readline());
  let index;
  for(let i=0;i<n;i++){
    let line=(await readline()).split(" ");
    let op=line[0];
    let flag=false;
    switch(op){
      case "show":
        root.show();
        break;
      case "get":
        index=parseInt(line[1]);
        let node=root.getNode(index);
        if(node) out.write(node.data.toString());
        else out.write("get fail");
        break;
      case "delete":
        index=parseInt(line[1]);
        flag=root.deleteNode(index);
        if(flag) out.write("delete OK");
        else out.write("delete fail");
        break;
      case "insert":
        index=parseInt(line[1]);
        flag=root.insert(index,parseInt(line[2]));
        if(flag) out.write("insert OK");
        else out.write("insert fail");
        break;
    }
    console.log();
  }
}

main();