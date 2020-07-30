#include<iostream>
using namespace std;
int main(){
float a1,a2,dis;
  int d;
  cin>>a1>>a2>>d;
  cout<<a1+a2<<endl;
  dis=(d/100.0f)*(a1+a2);
  cout<<((a1+a2)-dis)<<endl;
  cout<<dis;
}
