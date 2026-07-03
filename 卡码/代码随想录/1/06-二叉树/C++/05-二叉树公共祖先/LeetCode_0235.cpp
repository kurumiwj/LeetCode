//235. 二叉搜索树的最近公共祖先
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
    while(root){
			if(root->val>p->val&&root->val>q->val) root=root->left;
			else if(root->val<p->val&&root->val<q->val) root=root->right;
			else return root;
		}
		return nullptr;
  }
};

int main(){
  system("pause");
  return 0;
}
