#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int marks;
  cin>>marks;
  if(marks>100)
    cout<<"Invalid Input";
  else if(marks==100)
    cout<<"S";
  else if(marks>=90 && marks<100)
    cout<<"A";
  else if(marks>=80 && marks<90)
    cout<<"B";
  else if(marks>=70 && marks<80)
    cout<<"C";
  else if(marks>=60 && marks<70)
 	cout<<"D";
  else if(marks>=50 && marks<60)
    cout<<"E";
  else
    cout<<"F";
return 0;
}