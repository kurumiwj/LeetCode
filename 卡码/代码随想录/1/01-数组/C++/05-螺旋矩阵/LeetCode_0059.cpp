//59. ÂİĞı¾ØÕó II
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	public:
		vector<vector<int>> generateMatrix(int n) {
			int startX=0,startY=0,offset=1,count=1,loop=n/2;
			vector<vector<int>> nums(n);
			for(auto it=nums.begin();it!=nums.end();it++){
				vector<int> tmp(n);
				(*it)=tmp;
			}
			while(loop--){
				int i=startX,j=startY;
				for(j=startY;j<n-offset;j++) nums[i][j]=count++;
				for(i=startX;i<n-offset;i++) nums[i][j]=count++;
				for(;j>startY;j--) nums[i][j]=count++;
				for(;i>startX;i--) nums[i][j]=count++;
				startX++,startY++,offset++;
			}
			if(n%2!=0) nums[n/2][n/2]=count;
			return nums;
		}
		void printNums(vector<vector<int>> nums){
			for(int i=0;i<nums.size();i++){
				for(int j=0;j<nums.size();j++){
					if(j!=0) printf(" ");
					printf("%d",nums[i][j]);
				}
				printf("\n");
			}
		}
};

int main() {
	Solution* solution=new(Solution);
	vector<vector<int>> nums=solution->generateMatrix(5);
	solution->printNums(nums);
	return 0;
}
