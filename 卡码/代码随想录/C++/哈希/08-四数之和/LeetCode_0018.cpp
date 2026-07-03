//18. 四数之和
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
  vector<vector<int>> fourSum(vector<int>& nums, int target) {
  	vector<vector<int>> res;
  	sort(nums.begin(),nums.end());
  	for(int k=0;k<nums.size()-3;k++){
			if(nums[k]>target&&nums[k]>=0) break;
			if(k>0&&nums[k]==nums[k-1]) continue;
			for(int i=k+1;i<nums.size()-2;i++){
				if(nums[k]+nums[i]>target&&nums[i]>=0) break;
				if(i>k+1&&nums[i]==nums[i-1]) continue;
				int left=i+1,right=nums.size()-1;
				while(left<right){
					int n1=nums[left],n2=nums[right];
					if((long)nums[k]+nums[i]+n1+n2==target){
						res.push_back(vector<int>{nums[k],nums[i],n1,n2});
						while(left<right&&nums[left]==n1) left++;
						while(left<right&&nums[right]==n2) right--;
					}else if((long)nums[k]+nums[i]+n1+n2<target) left++;
					else right--;
				}
			}
		}
		return res;
  }
};
