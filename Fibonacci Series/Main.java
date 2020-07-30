#include<iostream>
using namespace std;
int fib(int n);
int main()
{
  int n,result;
  cin>>n;
  result=fib(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<result;
  return 0;
}
int fib(int n)
{
  if(n==0)
  {
    return 0;
  }
  else if(n==1)
  {
    return 1;
  }
  else
  {
    return (fib(n-1)+fib(n-2));
  }
}