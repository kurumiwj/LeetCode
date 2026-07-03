//404. ×óÒ¶×ÓÖ®ºÍ
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  int sumOfLeftLeaves(TreeNode* root) {
		if(!root) return 0;
		int leftSum=0;
		if(root->left&&!root->left->left&&!root->left->right) leftSum=root->left->val;
		return leftSum+sumOfLeftLeaves(root->left)+sumOfLeftLeaves(root->right);
  }
};

int main(){
  system("pause");
  return 0;
}
