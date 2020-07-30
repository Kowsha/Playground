#include<iostream>
using namespace std;
struct node{
    int data;
    struct node *next;
}*head=NULL;
void insert(int data){
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = data;
    newnode->next = NULL;
    if(head == NULL){
        head = newnode;
    }
    else{
        struct node *temp = head;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next = newnode;
    }
    return;
}
int deletesecondelementfromlast(){
  if(head==NULL){
        printf("Deletion of second last element is not possible");
        return 0;
    }
    struct node *temp=head;
    struct node *temp1=temp;
    struct node *temp2=temp1;
  
    while(temp->next!=NULL){
        temp2=temp1;
        temp1=temp;
        temp=temp->next;
    }
    if(temp == temp1 && temp==temp2 && temp1 == temp2){
        printf("Deletion of second last element is not possible");
        return 0;
    }
    else if(temp1==temp2){
        head=temp;
    }
    else{
        temp2->next=temp1->next;
    }
    return 1;
}
void print(){
    struct node *temp=head;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
}
int main(){
    int data;
    while(1){
        cin>>data;
        if(data<0){
            break;
        }
        insert(data);
    }
    // print();
    data = deletesecondelementfromlast();
    if(data==1){
        print();
    }
    return 0;
}