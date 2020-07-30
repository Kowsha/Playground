#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int n,m,mul;
  cout<<"Enter n"<<endl;
  cout<<"Enter m"<<endl;
  cin>>n>>m;
  int i;
  cout<<"The multiplication table of "<<n<<" is"<<endl;
  for(i=1;i<=m;i++)
  {
    cout<<i<<"*"<<n<<"="<<i*n<<endl;
}
}