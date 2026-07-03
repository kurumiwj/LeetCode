//144-145-94.二叉树的前/后/中序遍历
#include <iostream>
#include <vector>
#include "../TreeNode.h"
using namespace std;

class Solution{
public:
	Solution(){}
	~Solution(){}
	//先序遍历
	vector<int> preorderTraversal(TreeNode* root) {
		vector<int> res;
		preOrder(root,res);
		return res;
	}
	void preOrder(TreeNode* root,vector<int>& v){
		if(root==nullptr) return;
		v.push_back(root->val);
		preOrder(root->left,v);
		preOrder(root->right,v);
	}
	//中序遍历
	vector<int> inorderTraversal(TreeNode* root) {
		vector<int> res;
		inOrder(root,res);
		return res;
	}
	void inOrder(TreeNode* root,vector<int>& v){
		if(root==nullptr) return;
		inOrder(root->left,v);
		v.push_back(root->val);
		inOrder(root->right,v);
	}
	//后序遍历
	vector<int> postorderTraversal(TreeNode* root) {
		vector<int> res;
		postOrder(root,res);
		return res;
	}
	void postOrder(TreeNode* root,vector<int>& v){
		if(root==nullptr) return;
		postOrder(root->left,v);
		postOrder(root->right,v);
		v.push_back(root->val);
	}
};

int main(){
	system("pause");
	return 0;
}
