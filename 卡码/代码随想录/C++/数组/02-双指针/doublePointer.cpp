//27. 移除元素
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int removeElement(vector<int>& nums, int val) {
		int slow=0;
		for(int fast=0;fast<nums.size();fast++){
			if(nums[fast]!=val) nums[slow++]=nums[fast];
		}
		return slow;
	}
};

int main(){
	vector<int> nums={0,1,2,2,3,0,4,2};
	Solution solution=new Solution();
	printf("%d\n",solution->removeElement(nums,2));
	return 0;
}