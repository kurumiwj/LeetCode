#383. 赎金信
from typing import *

class Solution:
	def canConstruct(self, ransomNote: str, magazine: str) -> bool:
		if len(ransomNote)>len(magazine):
			return False
		hash=[0 for x in range(26)]
		for ch in magazine:
			hash[ord(ch)-ord('a')]+=1
		for ch in ransomNote:
			hash[ord(ch)-ord('a')]-=1
			if hash[ord(ch)-ord('a')]<0:
				return False
		return True