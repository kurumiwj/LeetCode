//977. 有序数组的平方
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
  vector<int> sortedSquares(vector<int>& nums) {
		vector<int> res(nums.size());
		int i=0,j=nums.size()-1,k=j;
		while(i<=j){
			if(pow2(nums[i])>pow2(nums[j])) res[k--]=pow2(nums[i++]);
			else res[k--]=(int)pow2(nums[j--]);
		}
		return res;
  }
  int pow2(int n){
  	return n*n;
  }
};

int main(){
	vector<int> nums={-4,-1,0,3,10};
	Solution* solution=new Solution();
	for(int value:solution->sortedSquares(nums)) printf("%d ",value);
	return 0;
}