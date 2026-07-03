//377. 组合总和 Ⅳ
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int combinationSum4(vector<int>& nums, int target) {
		vector<int> dp(target+1,0);
		dp[0]=1;
		for(int i=0;i<=target;i++){
			for(int num:nums){
				if(i>=num&&dp[i]<INT_MAX-dp[i-num]) dp[i]+=dp[i-num];
			}
		}
		return dp[target];
	}
};

int main(){
  system("pause");
  return 0;
}
