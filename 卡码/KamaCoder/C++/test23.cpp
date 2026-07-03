//23. 二叉树的高度
#include <iostream>
using namespace std;

struct Node{
	char data;
	Node* left;
	Node* right;
	Node(char data):data(data),left(nullptr),right(nullptr){}
};

int getHeight(Node* root){
	int leftHeight=0,rightHeight=0;
	if(root->left!=nullptr) leftHeight=getHeight(root->left);
	if(root->right!=nullptr) rightHeight=getHeight(root->right);
	return max(leftHeight,rightHeight)+1;
}

Node* createTree(string preOrder,string inOrder,int preLeft,int preRight,int inLeft,int inRight){
	if(preLeft>preRight||inLeft>inRight) return nullptr;
	int rootIndex=inOrder.find(preOrder[preLeft]);
	Node* root=new Node(preOrder[preLeft]);
	int leftNum=rootIndex-inLeft;
	root->left=createTree(preOrder,inOrder,preLeft+1,preLeft+leftNum,inLeft,rootIndex-1);
	root->right=createTree(preOrder,inOrder,preLeft+1+leftNum,preRight,rootIndex+1,inRight);
	return root;
}

int main(){
	int n;
	while(scanf("%d\n",&n)!=EOF){
		string preOrder,inOrder;
		cin>>preOrder>>inOrder;
		Node* root=createTree(preOrder,inOrder,0,n-1,0,n-1);
		printf("%d\n",getHeight(root));
	}
	return 0;
}