#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int t,v;
  cin>>t>>v;
  float w=35.74+0.6215*t+((0.4275*t)-35.75)*pow(v,0.16);
  cout<<w;
}
