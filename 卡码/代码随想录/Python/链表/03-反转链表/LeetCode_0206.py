#206. 反转链表
from typing import *

class ListNode:
	def __init__(self,val=0,next=None):
		self.val=val
		self.next=next

class Solution:
	#递归
	def reverseList(self,head:Optional[ListNode])->Optional[ListNode]:
		#如果链表为空或者只有一个元素
		if head==None or head.next==None:
			return head
		node:Optional[ListNode]=self.reverseList(head.next)
		head.next.next=head
		head.next=None
		return node
	#双指针法
	def reverseList1(self,head:Optional[ListNode])->Optional[ListNode]:
		#如果链表为空或者只有一个元素
		if head==None or head.next==None:
			return head
		pre:Optional[ListNode]=None
		cur:Optional[ListNode]=head
		while cur:
			tmp:Optional[ListNode]=cur.next
			cur.next=pre
			pre=cur
			cur=tmp
		return pre
