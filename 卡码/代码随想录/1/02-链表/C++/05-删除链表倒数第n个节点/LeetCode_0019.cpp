//19. 删除链表的倒数第 N 个结点
struct ListNode{
	int val;
	ListNode* next;
	ListNode():val(0),next(nullptr){}
	ListNode(int val):val(val),next(nullptr){}
	ListNode(int val,ListNode* next):val(val),next(next){}
};

class Solution {
public:
  ListNode* removeNthFromEnd(ListNode* head, int n) {
		ListNode* dummy=new ListNode(-1,head);
		ListNode* fast=dummy;
		ListNode* slow=dummy;
		n++;
		while(n--) fast=fast->next;
		while(fast){
			fast=fast->next;
			slow=slow->next;
		}
		ListNode* tmp=slow->next;
		slow->next=tmp->next;
		delete tmp;
		return dummy->next;
  }
};
