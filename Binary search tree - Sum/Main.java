#include <bits/stdc++.h> 
using namespace std; 
  
struct Node { 
    int data; 
    Node *left, *right; 
    Node(int x) 
    { 
        data = x; 
        left = right = NULL; 
    } 
}; 
/* utility that allocates a new Node with the given key  */
Node* insert(Node* root, int value) 
{ 
    if (root == NULL) 
        return new Node(value); 
    if (value < root->data) 
        root->left = insert(root->left, value); 
    else if (value > root->data) 
        root->right = insert(root->right, value); 
    return root; 
} 
/* Function to find sum of all the elements*/
int addBT(Node* root) 
{ 
    if (root == NULL) 
        return 0; 
    return (root->data + addBT(root->left) + addBT(root->right)); 
} 
  
/* Driver program to test above functions*/
int main() 
{ 
   struct Node *root=NULL;
  int value;
  while(1)
  {
    cin>>value;
    if(value<0)
      break;
    root = insert(root, value); 
  }
    int sum = addBT(root); 
    cout << "Sum of all nodes are " << sum << endl; 
  
    return 0; 
}