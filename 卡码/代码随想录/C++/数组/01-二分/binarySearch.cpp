//704. 二分查找
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
  int search(vector<int>& nums, int target) {
		int left=0,right=nums.size()-1;
		while(left<=right){
			int middle=(left+right)/2;
			if(nums[middle]==target) return middle;
			else if(target<nums[middle]) right=middle-1;
			else left=middle+1;
		}
		return -1;
  }
};

int main(){
	Solution solution=new Solution();
	vector<int> nums(6);
	nums.push_back(-1);
	nums.push_back(0);
	nums.push_back(3);
	nums.push_back(5);
	nums.push_back(9);
	nums.push_back(12);
	cout<<solution->search(nums,9);
	cout<<solution->search(nums,2);
	cout<<solution->search(nums,13);
	return 0;
}