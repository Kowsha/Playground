#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  int first,second,third;
  first=(x*y)/100;
  first=floor(first);
  x=x-first;
  second=(x*z)/100;
  second=floor(second);
   third=(x-second)/3;
  third=floor(third);
  cout<<first<<endl<<second<<endl<<third;
}