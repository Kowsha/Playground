#include <iostream>
using namespace std;
 struct ListNode{
    int data;
    struct ListNode *next;
};
 
int AddElement(struct ListNode **head, int d){
    struct ListNode *newNode = new struct ListNode;
    if(newNode == NULL)
        return 0;
    struct ListNode *t = *head;
    newNode->data = d;
    newNode->next = NULL;
    if(*head == NULL){
        *head = newNode;
        return 1;
    }
    while(t->next != NULL){
        t = t->next;
    }
    t->next = newNode;
    return 1;
}
 
int RemoveDuplicates(struct ListNode *head){
    struct ListNode *current;
    struct ListNode *previous;
    struct ListNode *itr;
    struct ListNode *tmp;
    if(head == NULL)
        return 0;
    if(head->next == NULL)
        return 1;
    current = head->next;
    previous = head;
    while(current != NULL){
        itr = head;
        while(itr != current){
            // remove node if equal
            if(itr->data == current->data){
                tmp = current;
                current = current->next;
                previous->next = current;
                delete tmp;
                break;
            }
            itr = itr->next;
        }
        if(itr == current){
            current = current->next;
            previous = previous->next;
        }
    }
}
int main(int argc, char* argv[]){
    struct ListNode *head = NULL;
    struct ListNode *ptr;
     int data;
    while(1){
        cin>>data;
        if(data<0){
            break;
        }
         AddElement(&head, data);
    }
  
    cout << "Linked list before removal of duplicates" << endl;
    ptr = head;
    while(ptr!=NULL){
        cout << ptr->data << endl;
        ptr = ptr->next;
    }
    RemoveDuplicates(head);
    cout << "Linked list after removal of duplicates" << endl;
    ptr = head;
    while(ptr!=NULL){
        cout << ptr->data << endl;
        ptr = ptr->next;
    }
}