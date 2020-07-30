#include<iostream>
using namespace std;
int main()
{
  int total,a,b,c,d,e;
  cin>>total;
  cin>>a;
  cin>>b;
  c=a*75;
  d=b*30;
  e=c+d;
  if(total>e)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will sink";
  }
}