#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int b[a];
  for(int i=0;i<a;i++)
  {
    cin>>b[i];
  }
  sort(b,b+a);
  cout<<"Sorted array is:"<<endl;
  for(int i=0;i<a;i++)
  {
    cout<<b[i]<<endl;
}
}