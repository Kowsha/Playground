#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,ans=2;
  cin>>n;
  for(int i=1;i<=n;i++){
    cout<<ans<<" ";
    ans=ans*ans-1;
  }
}
