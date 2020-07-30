#include <bits/stdc++.h> 
using namespace std; 
  
/* Tree node structure used in the program */
struct Node { 
    int data; 
   struct Node *left, *right; 
}; 
 void insert(struct Node **root,int value)
{
  Node *newnode=new Node;
  newnode->data=value;
  newnode->left=NULL;
  newnode->right=NULL;
  if(*root==NULL)
  {
    *root=newnode;
  }
  else
  {
    struct Node *node=*root;
    while(1)
    {
      if(node->data>value)
      {
        if(node->left==NULL)
        {
        node->left=newnode;
          return;
        }
        node=node->left;
      }
      else
      {
        if(node->right==NULL)
        {
          node->right=newnode;
          return;
        }
        node=node->right;
      }
    }
  }
  return;
}
/* Function to find height of a tree */
int height(Node *root, int &ans) 
{ 
    if (root == NULL) 
        return 0; 
  
    int left_height = height(root->left, ans); 
  
    int right_height = height(root->right, ans); 
  
    // update the answer, because diameter of a 
    // tree is nothing but maximum value of 
    // (left_height + right_height + 1) for each node 
    ans = max(ans, 1 + left_height + right_height); 
  
    return 1 + max(left_height, right_height); 
} 
  
/* Computes the diameter of binary tree with given root. */


// Driver code 
int main() 
{ 
    struct Node *root =NULL; 
     int value;
  while(1)
  {
    cin>>value;
    if(value<0)
      break;
    insert(&root,value);
  }
  int ans = INT_MIN; // This will store the final answer 
  int a=height(root, ans); 
    cout<<"Height of the tree is "<<a; 
  
    return 0; 
}