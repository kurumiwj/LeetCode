//654. ×î´ó¶þ²æÊ÷
#include <iostream>
#include <vector>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
	TreeNode* traversal(vector<int>& nums,int left,int right){
		if(left>=right) return nullptr;
		int maxIndex=left;
		for(int i=left;i<right;i++)
			if(nums[i]>nums[maxIndex]) maxIndex=i;
		TreeNode* root=new TreeNode(nums[maxIndex]);
		root->left=traversal(nums,left,maxIndex);
		root->right=traversal(nums,maxIndex+1,right);
		return root;
	}
  TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
		return traversal(nums,0,nums.size());
  }
};

int main(){
  system("pause");
  return 0;
}
