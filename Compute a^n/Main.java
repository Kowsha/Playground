#include<iostream>
using namespace std;
int calculatePower(int ,int);
int main()
{
  int a,n,result;
  cout<<"Enter the value of a "<<endl;
  cin>>a;
  cout<<"Enter the value of n "<<endl;
  cin>>n;
  result=calculatePower(a,n);
  cout<<"The value of "<< a<<" power "<< n <<" is "<< result;
  return 0;
}
int calculatePower(int a,int n)
{
  if(n!=0)
    return(a*calculatePower(a,n-1));
  else
    return 1;
}