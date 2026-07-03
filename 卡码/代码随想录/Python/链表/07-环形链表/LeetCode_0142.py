#142. 环形链表 II
from typing import *

class ListNode:
	def __init__(self,val=0,next=None):
		self.val=val
		self.next=next

class Solution:
		def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
			slow,fast=head,head
			while fast!=None and fast.next!=None:
				slow=slow.next
				fast=fast.next.next
				#快慢指针相交必有环
				if slow==fast:
					index1,index2=fast,head
					while index1!=index2:
						index1,index2=index1.next,index2.next
					return index1
			return None