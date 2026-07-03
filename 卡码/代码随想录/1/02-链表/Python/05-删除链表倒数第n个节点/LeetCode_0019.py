#19. 删除链表的倒数第 N 个结点
from typing import *

class ListNode:
	def __init__(self,val=0,next=None):
		self.val=val
		self.next=next

class Solution:
	def removeNthFromEnd(self,head:Optional[ListNode],n:int)->Optional[ListNode]:
		dummy=ListNode(-1,head)
		fast=dummy
		slow=dummy
		n+=1
		while n>0:
			fast=fast.next
			n-=1
		while fast is not None:
			fast=fast.next
			slow=slow.next
		slow.next=slow.next.next
		return dummy.next
