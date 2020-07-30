#include<iostream>
using namespace std;
int main()
{
  int a,b,count=0;
  cin>>a>>b;
  int c[a],d[b];
  for(int i=0;i<a;i++)
  {
    cin>>c[i];
  }
  for(int i=0;i<b;i++)
  {
    cin>>d[i];
  }
  if(a==b)
  {
    for(int i=0;i<a;i++)
    {
      if(c[i]==d[i])
      {
        count++;
      }
    }
      if(count==a)
      {
        cout<<"Same";
      }
      else
      {
        cout<<"Not Same";
      }
  }
  else
  {
    cout<<"Not Same";
  }
}