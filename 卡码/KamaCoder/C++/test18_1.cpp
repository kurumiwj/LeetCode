//18. 链表的基本操作
#include <iostream>
using namespace std;

struct LinkedList{
	int data;
	LinkedList* next;
	LinkedList(int value):data(value),next(nullptr){}
};

typedef LinkedList* List;

int getLength(List root){
	List tmp=root;
	int index=0;
	if(root->data==-1) return 0;
	while(tmp!=nullptr){
		index++;
		tmp=tmp->next;
	}
	return index;
}

void show(List root){
	List tmp=root;
	if(tmp->data==-1){
		printf("Link list is empty");
	}else{
		while(tmp!=nullptr&&tmp->data!=-1){
			if(tmp!=root) printf(" ");
			printf("%d",tmp->data);
			tmp=tmp->next;
		}
	}
}

List get(List root,int index){
	if(index<1||index>getLength(root)) return NULL;
	List tmp=root;
	int i=1;
	while(tmp!=nullptr){
		if(i==index) return tmp;
		i++;
		tmp=tmp->next;
	}
}

bool deleteNode(List& root,int index){
	int len=getLength(root);
	if(index<1||index>len||len==0) return false;
	List tmp=root;
	int i=1;
	if(i==index){
		root=root->next;
	}else{
		while(tmp!=nullptr){
			i++;
			if(i==index) break;
			tmp=tmp->next;
		}
		tmp->next=tmp->next->next;
	}
	return true;
}

bool insert(List& root,int index,int value){
	if(index<1||index>getLength(root)+1) return false;
	List tmp=root;
	List node=new LinkedList(value);
	int i=1;
	if(i==index){
		node->next=root;
		root=node;
	}else{
		while(tmp!=nullptr){
			i++;
			if(i==index) break;
			tmp=tmp->next;
		}
		node->next=tmp->next;
		tmp->next=node;
	}
	return true;
}

int main(){
	int n;
	scanf("%d",&n);
	List list=new LinkedList(-1);
	for(int i=0;i<n;i++){
		int tmp;
		scanf("%d",&tmp);
		insert(list,1,tmp);
	}
	scanf("%d\n",&n);
	int index;
	string op;
	bool flag;	//记录删除和插入是否成功
	for(int i=0;i<n;i++){
		cin>>op;
		if(op=="show"){
			show(list);
		}else if(op=="delete"){
			cin>>index;
			flag=deleteNode(list,index);
			if(flag) printf("delete OK");
			else printf("delete fail");
		}else if(op=="get"){
			cin>>index;
			List node=get(list,index);
			if(node==nullptr) printf("get fail");
			else printf("%d",node->data);
		}else{
			int value;
			scanf("%d %d\n",&index,&value);
			flag=insert(list,index,value);
			if(flag) printf("insert OK");
			else printf("insert fail");
		}
		printf("\n");
	}
	return 0;
}