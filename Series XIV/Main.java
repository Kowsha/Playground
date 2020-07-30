#include<iostream>
using namespace std;
int main()
{
    int a,b=2,c=1,d=2;
    cin>>a;
    cout<<b<<" ";
    for(int i=2;i<=a;i++)
    {
        b=(b*d)+c;
        cout<<b<<" ";
    }  
    return 0;
}