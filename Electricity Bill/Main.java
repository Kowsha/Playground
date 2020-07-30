#include<iostream>
using namespace std;
int main()
{
  int u;
  cin>>u;
  int a,b,c,d;
  a=u*0.5;
  b=(u*0.65)+100;
  c=(u*0.80)+200;
  d=(u*1.25)+425;
  if(u<=200)
    cout<<"Rs."<<a;
  else if(u>200 && u<=400)
    cout<<"Rs."<<b;
  else if(u>400 && u<=600)
    cout<<"Rs."<<c;
  else if(u>600)
    cout<<"Rs."<<d;
}