//349. 两个数组的交集
#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

class Solution {
public:
  vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
		unordered_set<int> hash;
		unordered_set<int> res;
		for(int num:nums1) hash.insert(num);
		for(int num:nums2)
			if(hash.find(num)!=hash.end()) res.insert(num);
		return vector<int>(res.begin(),res.end());
  }
};
