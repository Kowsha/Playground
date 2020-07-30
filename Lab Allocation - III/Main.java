#include<iostream>
using namespace std;
int main()
{
  static int count=0;
  int a,b,c,n; 
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>n;
  if(n<=a)
  count++;
  if(n<=b)
    count++;
  if(n<=c)
    count++;
  cout<<(count);
  }
