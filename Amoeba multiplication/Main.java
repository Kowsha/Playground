#include<iostream>
using namespace std;
int main()
{
  int n, t1=0,t2=1,nt=0,i;
  cin>>n;
  if(n==0||n==1){
    cout<<n;
}
  else{
    nt=t1+t2;
  }
  for(i=3;i<=n;++i){
    t1=t2;
    t2=nt;
    nt=t1+t2;
  }
  cout<<t2;
}

    