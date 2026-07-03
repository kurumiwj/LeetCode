//19. 删除链表的倒数第 N 个结点
function ListNode(val,next){
  this.val=(val===undefined ? 0 : val);
  this.next=(next===undefined ? null : next);
}

const removeNthFromEnd = (head, n)=> {
  let dummy=new ListNode(-1,head);
  let fast=dummy,slow=dummy;
  n++;
  while(n-->0) fast=fast.next;
  while(fast!=null){
    fast=fast.next;
    slow=slow.next;
  }
  slow.next=slow.next.next;
  return dummy.next;
};