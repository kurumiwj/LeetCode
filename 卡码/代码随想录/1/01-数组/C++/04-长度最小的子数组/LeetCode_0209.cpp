//209. 长度最小的子数组
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
  int minSubArrayLen(int target, vector<int>& nums) {
		int i=0,sum=0,res=nums.size()+1;
		for(int j=0;j<nums.size();j++){
			sum+=nums[j];
			while(sum>=target){
				res=min(res,j-i+1);
				sum-=nums[i];
				i++;
			}
		}
		return res==nums.size()+1 ? 0 : res;
  }
};

int main(){
	int target=7;
	vector<int> nums={2,3,1,2,4,3};
	Solution* solution=new Solution();
	printf("%d\n",solution->minSubArrayLen(target,nums));
	return 0;
}