//45. 跳跃游戏 II
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	int jump(vector<int>& nums) {
		int res=0,cur=0,next=0;
		for(int i=0;i<nums.size()-1;i++){
			next=max(next,nums[i]+i);
			if(i==cur){
				cur=next;
				res++;
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
