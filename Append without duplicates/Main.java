#include <iostream>

using namespace std;



struct node{
    int data;
    struct node *next;
}*head=NULL;

void insert(int data){
    struct node *newnode = (struct node *) malloc(sizeof(struct node));
    newnode->data = data;
    newnode->next = NULL;
    if(head==NULL){
        head = newnode;
    }
    else{
        struct node *temp;
        temp=head;
        while(temp->data!=data){
            if(temp->next == NULL){
                temp->next = newnode;
                return;
            }
            temp = temp->next;
        }
        return;
    }
}
void print(){
    struct node *temp = head;
    while(temp!=NULL){
        cout<<temp->data<<"\n";
        temp = temp->next;
    }
}
int main(){
    int data;
    char k[100];
    while(1)
  {
  cin>>data;
    if(data<0)
    {
      if(head==NULL)
      {
        cout<<"List is empty"<<endl;
      }
      break;
    }
    int l=(int)data;
    insert(l);
  }
    print();
    return 0;
}