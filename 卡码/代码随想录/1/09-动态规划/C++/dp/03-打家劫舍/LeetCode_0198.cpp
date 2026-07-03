//198. 打家劫舍
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int rob(vector<int>& nums) {
		int dp[nums.size()];
		dp[0]=nums[0];
		if(nums.size()>1) dp[1]=max(nums[0],nums[1]);
		for(int i=2;i<nums.size();i++){
			dp[i]=max(dp[i-2]+nums[i],dp[i-1]);
		}
		return dp[nums.size()-1];
	}
};

int main(){
  system("pause");
  return 0;
}
