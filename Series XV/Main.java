#include<iostream>
using namespace std;
int main()
{
    int a,b=3,c=8,d=2,e;
    cin>>a;
    if(a>1){
    cout<<b<<" ";
    cout<<c<<" ";
    for(int i=3;i<=a;i++){
        e=b+c+d;
        cout<<e<<" ";
        b=c;
        c=e;
        d+=1;
    }}
    else{
        cout<<b;
    }
    return 0;
}