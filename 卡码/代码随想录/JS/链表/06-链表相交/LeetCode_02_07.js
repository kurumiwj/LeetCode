//面试题 02.07. 链表相交
function ListNode(val,next){
  this.val=(val===undefined ? 0 : val);
  this.next=(next===undefined ? null : next);
}

const getIntersectionNode=(headA,headB)=>{
  let lenA=0,lenB=0,gap=0;
  let tmpA=headA,tmpB=headB;
  let maxNode,minNode;
  while(tmpA!=null){
    lenA++;
    tmpA=tmpA.next;
  }
  while(tmpB!=null){
    lenB++;
    tmpB=tmpB.next;
  }
  if(lenA>lenB){
    gap=lenA-lenB;
    maxNode=headA;
    minNode=headB;
  }else{
    gap=lenB-lenA;
    maxNode=headB;
    minNode=headA;
  }
  while(gap-->0) maxNode=maxNode.next;
  while(maxNode!=null){
    if(maxNode==minNode) return maxNode;
    maxNode=maxNode.next
    minNode=minNode.next
  }
  return null;
};