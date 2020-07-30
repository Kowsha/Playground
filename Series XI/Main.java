#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    double a,b=95.0,c=20.5,d;
    cin>>a;
    cout<<b<<" ";
    for(int i=1;i<a;i++){
        b+=c;
        cout<<b<<" ";
        c+=2;
    }
    return 0;
}