#include<iostream>
using namespace std;
int main()
{
 int n,ans=4;
  cin>>n;
  for(int i=1;i<=n;i++){
    cout<<ans<<" ";
    ans=ans+(i*i);
}
}