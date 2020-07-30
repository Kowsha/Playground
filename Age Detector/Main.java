#include<iostream>
using namespace std;
int main(){

 int b,c,age;
  
cin>>b;
  cin>>c;
  
  if(c>b)
  {
    age=c-b;
  }
  else if(b>c)
  {
   age=c-b+100;
  }
  else
  {
  age=0;
  }
 
 cout<<age;
}