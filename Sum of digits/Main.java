#include <iostream>
using namespace std;
int sumOfDigits(int n)
{ 
        if(n==0)
        {
              return 0;
        }
        else
        {
              return (n%10) + sumOfDigits(n/10);
        }
}
int main()
{
        int num;
        cout<<"Enter the value of n";
        cin>>num;
        cout<<"\nThe sum of digits in "<<num<<" is "<<sumOfDigits(num);
        return 0;
}