'''
@Author kurumi
@Date 2026-07-06 上午10:24:57
@Description 198. 打家劫舍
'''
class Solution:
    def rob(self, nums: List[int]) -> int:
        n: int = len(nums)
        if n == 1:
            return nums[0]
        dp: list = [0] * n
        dp[0], dp[1] = nums[0], max(nums[0], nums[1])
        for i in range(2, n):
            dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
        return dp[n - 1]

class Solution1:
    def rob(self, nums: List[int]) -> int:
        n: int = len(nums)
        if n == 1:
            return nums[0]
        d0, d1 = nums[0], max(nums[0], nums[1])
        for i in range(2, n):
            d0, d1 = d1, max(d1, d0 + nums[i])
        return d1
