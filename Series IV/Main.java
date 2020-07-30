#include<iostream>
using namespace std;
int main()
{
  int n;  
  cin>>n;
  float sum=0.5,count=3.0;
  for(float i=1;i<=n;i++)
  {
    cout<<sum<<" ";
    sum=sum*count;
  }
}