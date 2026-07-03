#127. 单词接龙
from typing import *
from collections import deque

class Solution:
  def __init__(self):
    self.q:deque[str]=deque()
    self.visited:set[str]=set()
    self.wordSet:set[str]=set()
  def changeLetter(self,word:str,endWord:str)->bool:
    for i in range(len(word)):
      for ch in range(ord('a'),ord('z')+1):
        newWord:str=word[:i]+chr(ch)+word[i+1:]
        if newWord==endWord:
          return True
        if newWord in self.wordSet and newWord not in self.visited:
          self.visited.add(newWord)
          self.q.append(newWord)
    return False
  def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
    self.wordSet=set(wordList)
    if endWord not in self.wordSet:
      return 0
    self.q.append(beginWord)
    path:int=1
    while len(self.q)>0:
      size:int=len(self.q)
      for i in range(size):
        word:str=self.q.popleft()
        if self.changeLetter(word,endWord):
          return path+1
      path+=1
    return 0
      