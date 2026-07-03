#239. 滑动窗口最大值
from typing import *
from collections import deque

class Queue:
  def __init__(self):
    self.queue=deque()
  def front(self)->int:
    return self.queue[0]
  def back(self)->int:
    return self.queue[-1]
  def empty(self):
    return len(self.queue)==0
  def push(self,val):
    while self.queue and val>self.back():
      self.queue.pop()
    self.queue.append(val)
  def pop(self,val):
    if self.queue and val==self.front():
      self.queue.popleft()

class Solution:
  def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
    res=[]
    queue=Queue()
    for i in range(k):
      queue.push(nums[i])
    res.append(queue.front())
    for i in range(k,len(nums)):
      queue.pop(nums[i-k])
      queue.push(nums[i])
      res.append(queue.front())
    return res