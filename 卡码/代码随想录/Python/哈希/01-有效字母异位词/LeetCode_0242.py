#242. 有效的字母异位词
class Solution:
	def isAnagram(self, s: str, t: str) -> bool:
			hash=[0 for i in range(26)]
			for ch in s:
				hash[ord(ch)-ord('a')]+=1
			for ch in t:
				hash[ord(ch)-ord('a')]-=1
			for num in hash:
				if num!=0:
					return False
			return True