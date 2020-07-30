#include <iostream>
using namespace std;
 int search(int arr[],int l,int r,int key)
{
  if(r<l)
    return -1;
  if(arr[l]==key)
    return l;
  if(arr[r]==key)
    return r;
  return search(arr,l+1,r-1,key);
}
 int main()
{

    int n,i;
   cin>>n;
    int arr[100];
    for(i=0;i<n;i++)
    {
      cin>>arr[i];
    }
    int key;
    cin>>key;
   int len = sizeof(arr)/sizeof(arr[0]);
    int index=search(arr,0,len-1,key);
    if(index!=-1)
    {
      cout<<key;
    }
    else
            cout<<"The number is not present in the list";
   return 0;
    
  }