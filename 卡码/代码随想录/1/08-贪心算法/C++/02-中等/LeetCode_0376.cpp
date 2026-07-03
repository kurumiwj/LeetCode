//376. 摆动序列
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int wiggleMaxLength(vector<int>& nums) {
		if(nums.size()<=1) return nums.size();
		int res=1,pre=0,cur=0;
		for(int i=1;i<nums.size();i++){
			cur=nums[i]-nums[i-1];
			if(pre>=0&&cur<0||pre<=0&&cur>0){
				res++;
				pre=cur;
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
