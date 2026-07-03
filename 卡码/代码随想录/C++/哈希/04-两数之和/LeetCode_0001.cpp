//1. 两数之和
#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
  vector<int> twoSum(vector<int>& nums, int target) {
  	unordered_map<int,int> m;
  	for(int i=0;i<nums.size();i++){
			if(m.find(target-nums[i])!=m.end()) return vector<int>{m[target-nums[i]],i};
			else m.insert(make_pair(nums[i],i));
		}
		return vector<int>{};
  }
};
