#include<iostream>
using namespace std;
int main()
{
   int x,y,z;
  string lab;
  cin>>x;
  cin>>y;
  cin>>z;
  cin>>lab;
  if(lab=="L1")
  {
    if(y<z)
      cout<<"L2";
    else
      cout<<"L3";
  }
  else if(lab=="L2")
  {
    if(x<z)
      cout<<"L1";
    else
      cout<<"L3";
  }
  else
  {
    if(x<y)
      cout<<"L1";
    else
      cout<<"L2";
  }
  return 0;
}
