#include<iostream>
using namespace std;
int main()
{
  int n,ans=5;
  cin>>n;
  for(int i=1;i<2*n;i++){
    if(i%2!=0){
      cout<<ans<<" ";
      ans=ans+(11*i);
    }
    else{
      continue;
    }
  }
}