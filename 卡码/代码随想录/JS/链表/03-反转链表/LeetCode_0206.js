//206. 反转链表
function ListNode(val,next){
  this.val=(val===undefined ? 0 : val);
  this.next=(next===undefined ? null : next);
}

//双指针法
const reverseList1=function(head){
  //如果链表为空或者只有一个元素
  if(head==null||head.next==null) return head;
  let pre=null;
  let cur=head;
  while(cur){
    let tmp=cur.next;
    cur.next=pre;
    pre=cur;
    cur=tmp;
  }
  return pre;
}

//递归
const reverseList=head=>{
  //如果链表为空或者只有一个元素
  if(head==null||head.next==null) return head;
  let node=reverseList(head.next);
  head.next.next=head;
  head.next=null;
  return node;
}