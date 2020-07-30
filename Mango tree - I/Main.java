#include<iostream>
using namespace std;
int main()
{

 int r,c,n;
cin>>r>>c>>n;
  if(n>=1 && n<=c || n % r == 1 || n % c == 1)
    cout<<"Yes";
   else
     cout<<"No";


}