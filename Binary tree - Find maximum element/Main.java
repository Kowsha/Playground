#include <bits/stdc++.h> 
using namespace std; 
  
struct node { 
    int data; 
    struct node* left; 
    struct node* right; 
}; 
  
 
struct node* newNode(int data) 
{ 
    struct node* node = (struct node*) 
        malloc(sizeof(struct node)); 
    node->data = data; 
    node->left = NULL; 
    node->right = NULL; 
  
    return (node); 
} 
  
 
struct node* insert(struct node* node, int data) 
{ 
    if (node == NULL) 
        return (newNode(data)); 
    else { 
        
        if (data <= node->data) 
            node->left = insert(node->left, data); 
        else
            node->right = insert(node->right, data); 
  
        
        return node; 
    } 
} 
  

int maxValue(struct node* node) 
{    
    
    struct node* current = node; 
    while (current->right != NULL)  
        current = current->right; 
      
    return (current->data); 
} 
  

int main() 
{ 
    struct node* root = NULL; 
   int keys;
    while(1)
    {
      cin>>keys;
      if(keys<0)
        break;
      root = insert(root, keys); 
    }
    cout << "Maximum element is " << maxValue(root); 
  
    return 0; 
}