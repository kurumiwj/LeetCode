//213. 打家劫舍 II
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int rob0(vector<int>& nums,int start,int end){
		if(end-start==1) return nums[start];
		int dp[nums.size()];
		dp[start]=nums[start];
		if(end-start>1) dp[start+1]=max(nums[start],nums[start+1]);
		for(int i=start+2;i<end;i++){
			dp[i]=max(dp[i-2]+nums[i],dp[i-1]);
		}
		return dp[end-1];
	}
	int rob(vector<int>& nums) {
		if(nums.size()==1) return nums[0];
		return max(rob0(nums,0,nums.size()-1),rob0(nums,1,nums.size()));
	}
};

int main(){
  system("pause");
  return 0;
}
