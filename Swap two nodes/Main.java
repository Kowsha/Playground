#include<iostream>
using namespace std;

struct node
{
    int value;
    node *next;
}*head=NULL;

void create_node(int a,node **head)
{
    node* new_node=new node();
    new_node->value=a;
    new_node->next=*head;
    *head=new_node;
}
void print(node *trav)
{
    while(trav!=NULL)
    {
        cout<<trav->value<<" ";
        trav=trav->next;
    }
}

void swap_nodes(node **head,int p,int q)
{
    if(p==q) return;      
    node *p_prev=NULL,*p_curr=*head,*q_prev=NULL,*q_curr=*head;
    while(p_curr!=NULL&&p_curr->value!=p)    
    {
        p_prev=p_curr;
        p_curr=p_curr->next;
    }
    
    
    while(q_curr!=NULL&&q_curr->value!=q)    
    {
        q_prev=q_curr;
        q_curr=q_curr->next;
    }

    if(p_curr==NULL || q_curr==NULL) return;   
   
    if(p_prev!=NULL) p_prev->next=q_curr;      
    else *head=q_curr;
   
    if(q_prev!=NULL) q_prev->next=p_curr;      
    else *head=p_curr;
    
     node* pole=q_curr->next;                
    q_curr->next=p_curr->next;
    p_curr->next=pole;
}
int main()
{
    struct node *start=NULL;
  	int n;
   cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    {   
        cin>>a[i];
        //create_node(a[i],&start);
    }
   for(int i=n-1;i>=0;i--)
    {   
        create_node(a[i],&start);
    }
    
    int p ,q;
    cin>>p>>q;
    swap_nodes(&start,p,q);
   print(start);
}