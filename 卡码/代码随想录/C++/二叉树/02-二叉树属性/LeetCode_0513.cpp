//513. ÕÒÊ÷×óÏÂ½ÇµÄÖµ
#include <iostream>
#include <queue>
#include "../TreeNode.h"
using namespace std;

class Solution {
	int maxDepth=-1;
	int res;
public:
	void traversal(TreeNode* root,int depth){
		if(!root->left&&!root->right){
			if(depth>maxDepth){
				maxDepth=depth;
				res=root->val;
			}
			return;
		}
		if(root->left) traversal(root->left,depth+1);
		if(root->right) traversal(root->right,depth+1);
		return;
	}
	int findBottomLeftValue(TreeNode* root) {
		traversal(root,0);
		return res;
  }
//  int findBottomLeftValue(TreeNode* root) {
//		queue<TreeNode*> q;
//		if(root) q.push(root);
//		int res=0;
//		while(!q.empty()){
//			int size=q.size();
//			for(int i=0;i<size;i++){
//				TreeNode* node=q.front();
//				q.pop();
//				if(i==0) res=node->val;
//				if(node->left) q.push(node->left);
//				if(node->right) q.push(node->right);
//			}
//		}
//		return res;
//  }
};

int main(){
  system("pause");
  return 0;
}
