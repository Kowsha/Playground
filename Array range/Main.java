#include<iostream>
using namespace std;
int main()
{
  int n,ran;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int low=0,gre=0;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  low=a[0];
  gre=a[0];
  for(int i=1;i<n;i++)
  {
    if(a[i]<low)
    {
      low=a[i];
    }
  }
  for(int i=1;i<n;i++)
  {
    if(a[i]>gre)
    {
      gre=a[i];
    }
  }
  ran=gre-low;
  cout<<"The range of the array is "<<ran;
 }