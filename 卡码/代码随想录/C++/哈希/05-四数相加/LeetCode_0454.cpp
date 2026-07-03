//454. 四数相加 II
#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
  int fourSumCount(vector<int>& nums1, vector<int>& nums2, vector<int>& nums3, vector<int>& nums4) {
		unordered_map<int,int> m;
		int sum=0;
		for(int num1:nums1)
			for(int num2:nums2)
				m[num1+num2]++;
		for(int num3:nums3)
			for(int num4:nums4){
				int target=-(num3+num4);
				sum+=m[target];
			}
		return sum;
  }
};
