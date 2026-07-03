#151. 反转字符串中的单词
class Solution:
  def reverseWords(self, s: str) -> str:
    # s=s.strip().split()
    # s.reverse()
    # return " ".join(list(s))
    return " ".join([str[::-1] for str in s.split()])[::-1]