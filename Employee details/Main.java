#include<iostream>
using namespace std;
union employee
{
  char name[30];
  int salary;
};
int main()
{
  employee emp;
  cin>>emp.name;
  cin>>emp.salary;
  cout<<"Enter the Employee details"<<endl;
  cout<<"Enter the Employee name : "<<endl;
  cout<<"Enter the Employee salary : "<<endl;
  cout<<"Employee Details"<<endl;
  cout<<emp.name<<" "<<emp.salary;
}