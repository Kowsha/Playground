#include <iostream>
using namespace std;
int main() 
{
   // Try out your code here
  int n,sum=0,sum1=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
        {
          cin>>a[i];
        }
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      sum1=sum1+a[i];
    }
    else
      sum=sum+a[i];
  }
cout<<"The sum of the even numbers in the array is "<<sum1<<endl;
cout<<"The sum of the odd numbers in the array is "<<sum;    }