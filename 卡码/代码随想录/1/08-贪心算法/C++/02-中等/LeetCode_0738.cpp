//738. 单调递增的数字
#include <iostream>
#include <algorithm>
using namespace std;

class Solution {
public:
	int monotoneIncreasingDigits(int n) {
		string nums=to_string(n);
		int start=nums.length();
		for(int i=nums.length()-1;i>0;i--){
			if(nums[i-1]>nums[i]){
				nums[i-1]--;
				start=i;
			}
		}
		for(int i=start;i<nums.length();i++) nums[i]='9';
		return stoi(nums);
	}
};

int main(){
  system("pause");
  return 0;
}
