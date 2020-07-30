#include<iostream>
using namespace std;
int main()
{
  int num,sum=0;
  cin>>num;
  for(int i=1;i<num;i++)
  {
    if(num%i==0)
    {
      sum=sum+i;
    }
  }
    if(num<sum)
    {
      cout<<"Abundant Number";
    }
    else
      cout<<"Not Abundant Number";
}