//105. 从前序与中序遍历序列构造二叉树
#include <iostream>
#include <vector>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
	TreeNode* traversal(vector<int>& inOrder,int inLeft,int inRight,vector<int>& preOrder,int preLeft,int preRight){
		if(inLeft>inRight) return nullptr;
		TreeNode* root=new TreeNode(preOrder[preLeft]);
		if(inLeft==inRight) return root;
		int rootIndex=0;
		for(int i=inLeft;i<=inRight;i++){
			if(inOrder[i]==root->val){
				rootIndex=i;
				break;
			}
		}
		int leftLength=rootIndex-inLeft;
		root->left=traversal(inOrder,inLeft,rootIndex-1,preOrder,preLeft+1,preLeft+leftLength);
		root->right=traversal(inOrder,rootIndex+1,inRight,preOrder,preLeft+1+leftLength,preRight);
		return root;
	}
  TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
		if(inorder.size()==0||preorder.size()==0) return nullptr;
		return traversal(inorder,0,inorder.size()-1,preorder,0,preorder.size()-1);
  }
};
