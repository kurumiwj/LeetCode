//674. 最长连续递增序列
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int findLengthOfLCIS(vector<int>& nums) {
		vector<int> dp(nums.size(),1);
		int res=1;
		for(int i=1;i<nums.size();i++){
			if(nums[i]>nums[i-1]) dp[i]=dp[i-1]+1;
			res=res>dp[i]?res:dp[i];
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
