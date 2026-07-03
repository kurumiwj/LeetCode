//142. 环形链表 II
struct ListNode{
	int val;
	ListNode* next;
	ListNode():val(0),next(nullptr){}
	ListNode(int val):val(val),next(nullptr){}
	ListNode(int val,ListNode* next):val(val),next(next){}
};

class Solution {
public:
  ListNode *detectCycle(ListNode *head) {
  	ListNode *fast=head,*slow=head;
  	while(fast&&fast->next){
			slow=slow->next;
			fast=fast->next->next;
			//快慢指针相交必有环
			if(slow==fast){
				ListNode *index1=fast,*index2=head;
				while(index1!=index2){
					index1=index1->next;
					index2=index2->next;
				}
				return index1;
			}
		}
		return nullptr;
  }
};
