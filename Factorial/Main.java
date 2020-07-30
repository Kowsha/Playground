#include<iostream>
using namespace std;
int factorial(int n){
  if(n==0){
    return 1;
  }
  else{
    return(n* factorial(n-1));
  }
}
int main()
{
  int i,fact=1,number;
  cin>>number;
  fact=factorial(number);
  cout<<"The factorial of "<<number<<" is "<<fact;
}
