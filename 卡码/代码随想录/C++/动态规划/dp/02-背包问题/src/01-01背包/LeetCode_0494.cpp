//494. 目标和
#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

class Solution {
public:
	int findTargetSumWays(vector<int>& nums, int target) {
		int sum=accumulate(nums.begin(),nums.end(),0);
		if(abs(target)>sum||(sum+target)%2==1) return 0;
		int n=(sum+target)/2;
		vector<int> dp(n+1,0);
		dp[0]=1;
		for(int i=0;i<nums.size();i++){
			for(int j=n;j>=nums[i];j--){
				dp[j]+=dp[j-nums[i]];
			}
		}
		return dp[n];
	}
};

int main(){
  system("pause");
  return 0;
}
