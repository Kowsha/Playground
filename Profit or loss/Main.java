#include<iostream>
using namespace std;
int main()
{
  int a,b,sp,c,d;
  cin>>a>>b;
  sp=b*12;
  if(a>sp)
  {
    c=a-sp;
    cout<<"Loss : Rs."<<c;
  }
  else if(sp>a)
  {
    d=sp-a;
    cout<<"Profit : Rs."<<d;
  }
  else
    cout<<"No profit nor loss";
}