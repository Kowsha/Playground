#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  cin>>a>>b>>c>>d>>e>>f;
 int x=a*b;
 int y=c*d;
 int z=e*f;
  int w=y+z;
  if(x>=w)
  {
    cout<<"Leonardo can fix both painting";
  }
  else
    cout<<"Leonardo cannot fix both painting";
}