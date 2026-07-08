'''
@Author kurumi
@Date 2026-07-08 下午2:48:12
@Description 70. 爬楼梯
'''
class Solution:
    def climbStairs(self, n: int) -> int:
        dp: list = [1] * (n + 1)
        for i in range(2, n + 1):
            dp[i] = dp[i - 1] + dp[i - 2]
        return dp[n]

class Solution1:
    def climbStairs(self, n: int) -> int:
        d0, d1 = 1, 1
        for i in range(2, n + 1):
            d0, d1 = d1, d0 + d1
        return d1

if __name__ == '__main__':
    solution = Solution1()
    print(solution.climbStairs(3))