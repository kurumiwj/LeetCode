//300. 最长递增子序列
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int lengthOfLIS(vector<int>& nums) {
		vector<int> dp(nums.size(),1);
		int maxLen=0;
		for(int i=1;i<nums.size();i++){
			for(int j=0;j<i;j++){
				if(nums[i]>nums[j]){
					dp[i]=max(dp[i],dp[j]+1);
				}
			}
			maxLen=maxLen>dp[i] ? maxLen : dp[i];
		}
		return maxLen;
	}
};

int main(){
  system("pause");
  return 0;
}
