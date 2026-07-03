#24. 两两交换链表中的节点
from typing import *

class ListNode:
	def __init__(self,val=0,next=None):
		self.val=val
		self.next=next

class Solution:
	def swapPairs(self,head:Optional[ListNode])->Optional[ListNode]:
		#如果链表为空或者只有一个元素
		if head==None or head.next==None:
			return head
		dummy=ListNode(-1,head)
		current=dummy
		while current.next and current.next.next:
			tmp=current.next	#保留1号位
			tmp1=tmp.next.next	#保留3号位
			current.next=tmp.next
			current.next.next=tmp
			tmp.next=tmp1
			current=tmp
		return dummy.next