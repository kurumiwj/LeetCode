//53. 最大子数组和
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int maxSubArray(vector<int>& nums) {
		int result=INT_MIN;
		int cnt=0;
		for(int num:nums){
			cnt+=num;
			if(cnt>result) result=cnt;
			if(cnt<=0) cnt=0;
		}
		return result;
	}
};

int main(){
  system("pause");
  return 0;
}
