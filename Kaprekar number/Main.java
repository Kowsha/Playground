#include <iostream>
#include<math.h>
using namespace std;

int main()
{
    int a,rem=0,c,d,e,sum=0,g,sum1=0,n=0,u,sum2;
    cin>>a;
    int f=a*a;
    int b=f;
    int p=f;
    while(b!=0)
    {
        rem++;
        b=b/10;
    }
    c=rem/2;
    d=rem-c;
    for(int i=0;i<d;i++)
    {
        e=f%10;
        sum=sum+(e*pow(10,i));
        f=f/10;
    }
    u=p/(pow(10,d));
    for(int i=d;i<rem;i++)
    {
        g=u%10;
        sum1=sum1+(g*pow(10,n));
        u=u/10;
        n++;
    }
    sum2=sum+sum1;
    if(sum2==a)
    {
        cout<<"Kaprekar Number";
    }
    else
    {
        cout<<"Not a Kaprekar Number";
    }
}
