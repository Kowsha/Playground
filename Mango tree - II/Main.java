#include<iostream>
using namespace std;
int main()
{

 int a,b,c;
cin>>a>>b>>c;
   if(c>=1&&c<=a||c%a==1||c>a*b-a&&c<=a*b)
        cout<<"Yes";
      else
        cout<<"No";


}