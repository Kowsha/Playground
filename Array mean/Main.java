#include<iostream>
using namespace std;
int main()
{
  int n,sum=0,d;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  d=sum/n;
  cout<<"The mean of the array is "<<d;
   }