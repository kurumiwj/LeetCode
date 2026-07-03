//108. 将有序数组转换为二叉搜索树
#include <iostream>
#include <vector>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
	TreeNode* traversal(vector<int>& nums,int left,int right){
		if(left>right) return nullptr;
		int mid=(left+right)/2;
		TreeNode* root=new TreeNode(nums[mid]);
		root->left=traversal(nums,left,mid-1);
		root->right=traversal(nums,mid+1,right);
		return root;
	}
  TreeNode* sortedArrayToBST(vector<int>& nums) {
		return traversal(nums,0,nums.size()-1);
  }
};

int main(){
  system("pause");
  return 0;
}
