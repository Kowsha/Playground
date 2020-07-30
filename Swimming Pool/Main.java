#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(int power=pow(a,3)*1000>b)
  cout<<"Can store";
  else
    cout<<"Cannot store";
  }