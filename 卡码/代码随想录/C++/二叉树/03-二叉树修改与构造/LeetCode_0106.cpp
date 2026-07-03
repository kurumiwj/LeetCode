//106. 从中序与后序遍历序列构造二叉树
#include <iostream>
#include <vector>
#include "../TreeNode.h"
using namespace std;

class Solution {
public:
	TreeNode* traversal(vector<int>& inOrder,int inLeft,int inRight,vector<int>& postOrder,int postLeft,int postRight){
		if(inLeft>inRight) return nullptr;
		TreeNode* root=new TreeNode(postOrder[postRight]);
		if(inLeft==inRight) return root;
		int rootIndex=0;
		for(int i=inLeft;i<=inRight;i++){
			if(inOrder[i]==root->val){
				rootIndex=i;
				break;
			}
		}
		int leftLength=rootIndex-inLeft;
		root->left=traversal(inOrder,inLeft,rootIndex-1,postOrder,postLeft,postLeft+leftLength-1);
		root->right=traversal(inOrder,rootIndex+1,inRight,postOrder,postLeft+leftLength,postRight-1);
		return root;
	}
  TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
		if(inorder.size()==0||postorder.size()==0) return nullptr;
		return traversal(inorder,0,inorder.size()-1,postorder,0,postorder.size()-1);
  }
};

int main(){
  system("pause");
  return 0;
}
