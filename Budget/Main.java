#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
	int a1,a2,a3,a4,a5;
  cin>>a1>>a2>>a3>>a4>>a5;
  int br=a1*350.34;
  int vs=a2*230.90;
  int as=a3*190.55;
  int ar=a4*125.30;
  int lg=a5*180.90;
  int tot=br+vs+as+ar+lg;
  if(tot<=15000){
    cout<<"Yes";
  }
  else{
    cout<<"No";
  }
}