//450. 删除二叉搜索树中的节点
#include <iostream>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  TreeNode* deleteNode(TreeNode* root, int key) {
  	if(!root) return nullptr;
  	if(root->val>key) root->left=deleteNode(root->left,key);
  	else if(root->val<key) root->right=deleteNode(root->right,key);
  	else{
			if(!root->left&&!root->right) return nullptr;
			else if(!root->left&&root->right) return root->right;
			else if(root->left&&!root->right) return root->left;
			else{
				TreeNode* tmp=root->right;
				TreeNode* parent=root;
				while(tmp->left){
					parent=tmp;
					tmp=tmp->left;
				}
				root->val=tmp->val;
				if(parent==root) parent->right=tmp->right;
				else parent->left=tmp->right;
				delete(tmp);
			}
		}
		return root;
  }
};

int main(){
  system("pause");
  return 0;
}
