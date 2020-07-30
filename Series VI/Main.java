#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int n,ans=0;
cin>>n;
for(int i=1;i<=n;i++){
  if(i%2!=0){
    ans=pow(i,2)-1;
  }
  else{
    ans=pow(i,2)-2;
  }
  cout<<ans<<" ";
}
}