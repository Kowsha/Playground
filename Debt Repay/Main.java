#include<bits/stdc++.h>
using namespace std;
int main()
{
  float p,r,n;
  float i,a,d,f;
  cin>>p>>r>>n;
  i=(p*r*n)/100;
  a=p+i;
  d=i/50;
  f=a-d;
  cout<<setprecision(2)<<fixed<<i<<endl;
  cout<<setprecision(2)<<fixed<<a<<endl;
  cout<<setprecision(2)<<fixed<<d<<endl;
  cout<<setprecision(2)<<fixed<<f<<endl;
}