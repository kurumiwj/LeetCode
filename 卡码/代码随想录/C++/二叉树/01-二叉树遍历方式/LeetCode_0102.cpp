//102. 二叉树的层序遍历
#include <iostream>
#include <vector>
#include <queue>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
	vector<vector<int>> levelOrder(TreeNode* root) {
		vector<vector<int>> res;
		vector<int> v;
		queue<TreeNode*> q;
		if(root!=nullptr) q.push(root);
		int size;
		while(!q.empty()){
			size=q.size();	//当前层元素个数
			v.clear();	//清空数组
			while(size-->0){
				TreeNode* node=q.front();
				q.pop();
				v.push_back(node->val);
				if(node->left) q.push(node->left);
				if(node->right) q.push(node->right);
			}
			res.push_back(v);
		}
		return res;
	}
};

int main(){
	system("pause");
	return 0;
}
