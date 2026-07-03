//104. 二叉树的最大深度
#include <iostream>
#include <queue>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  int maxDepth(TreeNode* root) {
		int depth=0;
		queue<TreeNode*> q;
		if(root) q.push(root);
		while(!q.empty()){
			int size=q.size();
			depth++;
			while(size-->0){
				TreeNode* node=q.front();
				q.pop();
				if(node->left) q.push(node->left);
				if(node->right) q.push(node->right);
			}
		}
		return depth;
  }
};

int main(){
  system("pause");
  return 0;
}
