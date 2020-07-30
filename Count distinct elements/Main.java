#include<iostream>
using namespace std;
int main()
{
  int c,n,count=0,flag=0;
  cin>>n;
  int a[n];
  c=n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    flag=0;
    for(int j=i+1;j<n;j++)
    {
      if(a[i]==a[j])
      {
        flag=1;
      }
    }
    c=c-flag;
  }
  cout<<"There are "<<c<<" distinct element in the array.";
}