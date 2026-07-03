//面试题 02.07. 链表相交
struct ListNode{
	int val;
	ListNode* next;
	ListNode():val(0),next(nullptr){}
	ListNode(int val):val(val),next(nullptr){}
	ListNode(int val,ListNode* next):val(val),next(next){}
};

class Solution {
public:
  ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
  	ListNode *tmpA=headA,*tmpB=headB;
  	int lenA=0,lenB=0,gap=0;
  	ListNode *maxNode,*minNode;
  	while(tmpA){
			lenA++;
			tmpA=tmpA->next;
		}
		while(tmpB){
			lenB++;
			tmpB=tmpB->next;
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
		while(gap--) maxNode=maxNode->next;
		while(maxNode){
			if(maxNode==minNode) return maxNode;
			maxNode=maxNode->next;
			minNode=minNode->next;
		}
		return nullptr;
  }
};
