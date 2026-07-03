//15. 三数之和
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
  vector<vector<int>> threeSum(vector<int>& nums) {
		vector<vector<int>> res;
		sort(nums.begin(),nums.end());
		for(int i=0;i<nums.size()-2;i++){
			int n1=nums[i];
			if(n1>0) break;
			if(i>0&&nums[i]==nums[i-1]) continue;
			int left=i+1,right=nums.size()-1;
			while(left<right){
				int n2=nums[left],n3=nums[right];
				if(n1+n2+n3==0){
					res.push_back(vector<int>{n1,n2,n3});
					while(left<right&&nums[left]==n2) left++;
					while(left<right&&nums[right]==n3) right--;
				}else if(n1+n2+n3<0) left++;
				else right--;
			}
		}
		return res;
  }
};
