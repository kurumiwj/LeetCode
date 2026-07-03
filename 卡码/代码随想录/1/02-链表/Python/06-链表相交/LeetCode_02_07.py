#面试题 02.07. 链表相交
from typing import *

class ListNode:
	def __init__(self,val=0,next=None):
		self.val=val
		self.next=next

class Solution:
	def getIntersectionNode(self,headA:ListNode,headB:ListNode)->ListNode:
		lenA,lenB,gap=0,0,0
		tmpA,tmpB=headA,headB
		while tmpA!=None:
			lenA+=1
			tmpA=tmpA.next
		while tmpB!=None:
			lenB+=1
			tmpB=tmpB.next
		if lenA>lenB:
			gap=lenA-lenB
			maxNode=headA
			minNode=headB
		else:
			gap=lenB-lenA
			maxNode=headB
			minNode=headA
		while gap>0:
			gap-=1
			maxNode=maxNode.next
		while maxNode!=None:
			if maxNode==minNode:
				return maxNode
			maxNode=maxNode.next
			minNode=minNode.next
		return None
