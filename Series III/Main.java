#include<iostream>
using namespace std;
int main()
{
  int n,j=3,sum=3;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<j<<" ";
    j=j*sum;
  }
}