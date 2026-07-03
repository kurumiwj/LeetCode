//700. ¶þ²æËÑË÷Ê÷ÖÐµÄËÑË÷
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  TreeNode* searchBST(TreeNode* root, int val) {
		while(root){
			if(val<root->val) root=root->left;
			else if(val>root->val) root=root->right;
			else return root;
		}
		return nullptr;
  }
};

int main(){
  system("pause");
  return 0;
}
