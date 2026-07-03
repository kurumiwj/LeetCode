//53. 最大子数组和
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int maxSubArray(vector<int>& nums) {
		int dp[nums.size()];
		dp[0]=nums[0];
		int res=nums[0];
		for(int i=1;i<nums.size();i++){
			dp[i]=max(dp[i-1]+nums[i],nums[i]);
			res=dp[i]>res?dp[i]:res;
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
