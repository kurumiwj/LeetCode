//22. 二叉树的遍历
#include <iostream>
#include <vector>
using namespace std;

struct Node{
	char data;
	int left,right;
	// Node(char data,int left,int right):data(data),left(left),right(right){}
};

vector<Node> nodes(1);

void preOrder(Node root){
	printf("%c",root.data);
	if(root.left!=0) preOrder(nodes[root.left]);
	if(root.right!=0) preOrder(nodes[root.right]);
}

void inOrder(Node root){
	if(root.left!=0) inOrder(nodes[root.left]);
	printf("%c",root.data);
	if(root.right!=0) inOrder(nodes[root.right]);
}

void postOrder(Node root){
	if(root.left!=0) postOrder(nodes[root.left]);
	if(root.right!=0) postOrder(nodes[root.right]);
	printf("%c",root.data);
}

int main(){
	int n;
	scanf("%d",&n);
	char data;
	int left,right;
	for(int i=1;i<=n;i++){
		getchar();
		scanf("%c %d %d",&data,&left,&right);
		nodes.push_back(Node{data,left,right});
	}
	preOrder(nodes[1]);
	printf("\n");
	inOrder(nodes[1]);
	printf("\n");
	postOrder(nodes[1]);
	return 0;
}