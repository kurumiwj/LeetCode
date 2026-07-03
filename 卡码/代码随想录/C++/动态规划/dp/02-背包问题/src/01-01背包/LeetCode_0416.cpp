//416. 分割等和子集
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	bool canPartition(vector<int>& nums) {
		int sum=0;
		for(int num:nums) sum+=num;
		if(sum%2==1) return false;
		int target=sum/2;
		vector<int> dp(10001,0);
		for(int i=0;i<nums.size();i++){
			for(int j=target;j>=nums[i];j--){
				dp[j]=max(dp[j],dp[j-nums[i]]+nums[i]);
			}
		}
		if(target==dp[target]) return true;
		return false;
	}
};

int main(){
  system("pause");
  return 0;
}
