//18. 链表的基本操作
#include <iostream>
using namespace std;

class Node{
	int data;
	Node *next;
public:
	Node(int _data):data(_data),next(nullptr){}
	int getData(){
		return data;
	}
	void setData(int data){
		this->data=data;
	}
	Node* getNext(){
		return this->next;
	}
	void setNext(Node* node){
		this->next=node;
	}
	friend ostream& operator<<(ostream& out,Node* node){
		out<<node->getData();
		return out;
	}
	~Node(){}
};

class List{
	int length=0;
	Node *root;
public:
	List(Node *node):root(node){}
	int getLength(){
		return this->length;
	}
	Node* getRoot(){
		return this->root;
	}
	//输出链表
	void show(){
		Node *tmp=root;
		if(tmp==nullptr){
			printf("Link list is empty");
			return;
		}
		while(tmp!=nullptr){
			cout<<tmp;
			if(tmp->getNext()!=nullptr) cout<<" ";
			tmp=tmp->getNext();
		}
	}
	//在index之前插入节点
	bool insert(int index,int value){
		if(index<1||index>getLength()+1) return false;
		this->length++;
		Node* tmp=this->root;
		//插入头结点
		if(index==1){
			Node* node=new Node(value);
			node->setNext(this->root);
			this->root=node;
		}else{
			int i=1;
			while(tmp->getNext()!=nullptr){
				i++;
				if(i==index) break;
				tmp=tmp->getNext();
			}
			Node* node=new Node(value);
			node->setNext(tmp->getNext());
			tmp->setNext(node);
		}
		return true;
	}
	//删除第index个节点
	bool deleteNode(int index){
		if(index<1||index>this->getLength()||this->getLength()==0) return false;
		this->length--;
		if(index==1) this->root=this->root->getNext();
		else{
			Node* tmp=root;
			int i=1;
			while(tmp->getNext()!=nullptr){
				i++;
				if(i==index) break;
				tmp=tmp->getNext();
			}
			tmp->setNext(tmp->getNext()->getNext());
		}
		return true;
	}
	//获取第index个节点
	Node* get(int index){
		if(index<1||index>this->getLength()) return nullptr;
		Node* tmp=root;
		int i=1;
		while(tmp!=nullptr){
			if(i==index) return tmp;
			tmp=tmp->getNext();
			i++;
		}
	}
	~List(){}
};

int main(){
	int n;
	scanf("%d",&n);
	List* list=new List(nullptr);
	for(int i=0;i<n;i++){
		int tmp;
		scanf("%d",&tmp);
		list->insert(1,tmp);
	}
	scanf("%d\n",&n);
	int index;
	string op;
	bool flag;	//记录删除和插入是否成功
	for(int i=0;i<n;i++){
		cin>>op;
		if(op=="show"){
			list->show();
		}else if(op=="delete"){
			cin>>index;
			flag=list->deleteNode(index);
			if(flag) printf("delete OK");
			else printf("delete fail");
		}else if(op=="get"){
			cin>>index;
			Node* node=list->get(index);
			if(node==nullptr) printf("get fail");
			else printf("%d",node->getData());
		}else{
			int value;
			scanf("%d%d",&index,&value);
			flag=list->insert(index,value);
			if(flag) printf("insert OK");
			else printf("insert fail");
		}
		printf("\n");
	}
	return 0;
}