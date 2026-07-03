//199. ¶þ²æÊ÷µÄÓÒÊÓ
#include <iostream>
#include <vector>
#include <queue>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
  vector<int> rightSideView(TreeNode* root) {
		vector<int> res;
		queue<TreeNode*> q;
		int size=0;
		if(root) q.push(root);
		while(!q.empty()){
			size=q.size();
			for(int i=0;i<size;i++){
				TreeNode *node=q.front();
				q.pop();
				if(i==size-1) res.push_back(node->val);
				if(node->left) q.push(node->left);
				if(node->right) q.push(node->right);
			}
		}
		return res;
  }
};

int main(){
  system("pause");
  return 0;
}
