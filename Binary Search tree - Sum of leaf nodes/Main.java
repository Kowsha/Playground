#include<iostream>
using namespace std;
struct BNode
{
  int data;
  struct BNode *left;
  struct BNode *right;
};
void bst_element(struct BNode **root,int value)
{
  BNode *newnode=new BNode;
  newnode->data=value;
  newnode->left=NULL;
  newnode->right=NULL;
  if(*root==NULL)
  {
    *root=newnode;
  }
  else
  {
    struct BNode *node=*root;
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
void leafSum(BNode *root, int &sum){ 
    if (!root) 
        return; 
    if (root->left==NULL && root->right==NULL) 
        sum += root->data;  
    leafSum(root->left, sum); 
    leafSum(root->right, sum); 
}
/*void inorder(struct BNode *node)
{
  if(node==NULL)
  {
    return;
  }
  inorder(node->left);
  cout<<node->data<<" ";
  inorder(node->right);
     
}*/
int main()
{
struct BNode *root=NULL;
  int sum=0;
  int value;
  while(1)
  {
    cin>>value;
    if(value<0)
      break;
    bst_element(&root,value);
  }
  //inorder(root);
    leafSum(root, sum);
   cout<<"Sum of all leaf nodes are "<<sum;

  return 0;
}