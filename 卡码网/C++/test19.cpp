// 19. 单链表反转
#include <iostream>

using namespace std;

struct Node{
	int data;
	Node* next;
	Node(int _data):data(_data),next(nullptr){}
};

int main() {
  int n;
  while (scanf("%d", &n) != EOF) {
  	if(n==0){
  		printf("list is empty\n");
  		continue;
  	}
  	Node* head=new Node(-1);
  	for(int i=0;i<n;i++){
  		int tmp;
  		scanf("%d",&tmp);
  		Node* node=new Node(tmp);
  		node->next=head->next;
  		head->next=node;
  		printf("%d",node->data);
  		if(i!=n-1) printf(" ");
  	}
  	printf("\n");
  	Node* node=head->next;
  	while(node){
  		printf("%d",node->data);
  		if(node->next){
  			printf(" ");
  		}
  		node=node->next;
  	}
  	printf("\n");
  }
  return 0;
}