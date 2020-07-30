#include<iostream>
using namespace std;
int main()
 {
 int i,j=2,n;
 cin>>n;
 for(i=1;i<=n;i++)
 {
 cout<<j<<" ";
 j=j+(13*i);
 }
 return 0;
 }