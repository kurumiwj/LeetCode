//21. 构造二叉树
#include <iostream>
using namespace std;

struct Node{
	char data;
	Node* left;
	Node* right;
	Node(int data):data(data),left(nullptr),right(nullptr){}
};

Node* createBTree(string preOrder,string inOrder,int preLeft,int preRight,int inLeft,int inRight){
	if(preLeft>preRight||inLeft>inRight) return nullptr;
	int rootIndex=inOrder.find(preOrder[preLeft]);
	Node* root=new Node(preOrder[preLeft]);
	int leftNum=rootIndex-inLeft;	//左子树节点个数
	root->left=createBTree(preOrder,inOrder,preLeft+1,preLeft+leftNum,inLeft,rootIndex-1);
	root->right=createBTree(preOrder,inOrder,preLeft+1+leftNum,preRight,rootIndex+1,inRight);
	return root;
}

void postOrder(Node* root){
	if(root->left!=nullptr) postOrder(root->left);
	if(root->right!=nullptr) postOrder(root->right);
	printf("%c",root->data);
}

int main(){
	string preOrder,inOrder;
	while(cin>>preOrder>>inOrder){
		Node* root=createBTree(preOrder,inOrder,0,preOrder.length()-1,0,inOrder.length()-1);
		postOrder(root);
		printf("\n");
	}
	return 0;
}
