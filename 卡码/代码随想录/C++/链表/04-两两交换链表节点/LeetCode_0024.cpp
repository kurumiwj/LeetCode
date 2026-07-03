//24. 两两交换链表中的节点
struct ListNode{
	int val;
	ListNode* next;
	ListNode():val(-1),next(nullptr){}
	ListNode(int val):val(val),next(nullptr){}
	ListNode(int val,ListNode* next):val(val),next(next){}
};

class Solution {
public:
  ListNode* swapPairs(ListNode* head) {
  	//如果链表为空或者只有一个元素
		if(head==nullptr||head->next==nullptr) return head;
		ListNode* dummy=new ListNode(-1,head);
		ListNode* current=dummy;
		while(current->next&&current->next->next){
			ListNode* tmp=current->next;	//保留一号位
			ListNode* tmp1=tmp->next->next;	//保留三号位
			current->next=tmp->next;
			current->next->next=tmp;
			tmp->next=tmp1;
			current=tmp;
		}
		return dummy->next;
  }
};
