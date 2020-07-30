#include<iostream>
using namespace std;
int main()
{
  int a=9,b=11,n,c;
  cin>>n;
  if(n==1){
    cout<<a<<" ";
  }
  else{
    cout<<a<<" ";
    cout<<b<<" ";
    for(int i=1;i<=n-2;i++){
      c=a+b;
      cout<<c<<" ";
      a=b;
      b=c;
    }
  }
}