//206. 反转链表
#include <iostream>
using namespace std;

struct ListNode{
	int val;
	ListNode* next;
	ListNode():val(0),next(nullptr){}
	ListNode(int val):val(val),next(nullptr){}
	ListNode(int val,ListNode* next):val(val),next(next){}
};

class Solution {
public:
	//递归
	ListNode* reverseList(ListNode* head){
		//如果链表为空或者只有一个元素
		if(head==nullptr||head->next==nullptr) return head;
		ListNode* node=reverseList(head->next);
		head->next->next=head;
		head->next=nullptr;
		return node;
	}
	//双指针法
  ListNode* reverseList1(ListNode* head) {
  	//如果链表为空或者只有一个元素
		if(head==nullptr||head->next==nullptr) return head;
		ListNode* pre=nullptr;
		ListNode* cur=head;
		while(cur){
			ListNode* tmp=cur->next;
			cur->next=pre;
			pre=cur;
			cur=tmp;
		}
		return pre;
  }
};

int main(){
	return 0;
}
