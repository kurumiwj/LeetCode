//24. 两两交换链表中的节点
function ListNode(val,next){
  this.val=(val===undefined ? 0 : val);
  this.next=(next===undefined ? null : next);
}

const swapPairs=head=>{
  //如果链表为空或者只有一个元素
  if(head==null||head.next==null) return head;
  let dummy=new ListNode(-1,head);
  let current=dummy;
  while(current.next&&current.next.next){
    let tmp=current.next; //保留1号位
    let tmp1=tmp.next.next; //保留3号位
    current.next=tmp.next;
    current.next.next=tmp;
    tmp.next=tmp1;
    current=tmp;
  }
  return dummy.next;
}