//142. 环形链表 II
function ListNode(val,next){
  this.val=(val===undefined ? 0 : val);
  this.next=(next===undefined ? null : next);
}

const detectCycle=head=>{
  let fast=head,slow=head;
  while(fast!=null&&fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    //快慢指针相交必有环
    if(slow==fast){
      let index1=fast,index2=head;
      while(index1!=index2){
        index1=index1.next;
        index2=index2.next;
      }
      return index1;
    }
  }
  return null;
}