#LCR 182. 动态口令
from typing import *

class Solution:
  def dynamicPassword(self, password: str, target: int) -> str:
    return "".join(list(reversed(list(reversed(password[:target]))+list(reversed(password[target:])))))