#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i,j,k;
  cin>>a>>b>>c>>d>>e>>f;
  g=a-d;
  h=b-e;
  i=(g*g)+(h*h);
  j=sqrt(i);
  k=c+f;
  if(j==k)
  {
    cout<<"Tangential";
  }
  else if(j<k)
  {
    cout<<"Overlap";
  }
  else
  {
    cout<<"Do not Overlap";
  }
}