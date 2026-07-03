//669. ÐÞ¼ô¶þ²æËÑË÷Ê÷
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  TreeNode* trimBST(TreeNode* root, int low, int high) {
		if(!root) return nullptr;
		if(root->val<low) return trimBST(root->right,low,high);
		else if(root->val>high) return trimBST(root->left,low,high);
		else{
			root->left=trimBST(root->left,low,high);
			root->right=trimBST(root->right,low,high);
		}
		return root;
  }
};

int main(){
  system("pause");
  return 0;
}
