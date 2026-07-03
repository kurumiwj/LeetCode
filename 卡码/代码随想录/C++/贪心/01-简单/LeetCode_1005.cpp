//1005. K 次取反后最大化的数组和
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
	int largestSumAfterKNegations(vector<int>& nums, int k) {
		sort(nums.begin(),nums.end(),[](int a,int b){return abs(a)>abs(b);});
		for(int i=0;i<nums.size();i++){
			if(nums[i]<0&&k>0){
				k--;
				nums[i]=-nums[i];
			}
		}
		if(k%2==1) nums[nums.size()-1]*=-1;
		return accumulate(nums.begin(),nums.end(),0);
	}
};

int main(){
  system("pause");
  return 0;
}
