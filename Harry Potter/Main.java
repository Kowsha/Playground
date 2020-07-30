#include<iostream>
using namespace std;
int main()
{ 
  int a;
  int arr[4];
  cin>>a;
  
  for(int i=0;i<4;i++)
  {
   arr[i]=a%10;
    a=a/10;
  }
  cout<<arr[0]+arr[3];
  }