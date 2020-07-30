#include<iostream>
using namespace std;
struct employee{
    char name[30];
    int  empId;
     int age;
  char designation[100];
    float salary;
};
 int main()
{
  struct employee emp;
   cout<<"Enter name:"<<endl;
   cin>>emp.name;
   cout<<"Enter ID:"<<endl;
   cin>>emp.empId;
   cout<<"Enter age:"<<endl;
   cin>>emp.age;
   cout<<"Enter designation:"<<endl;
   cin>>emp.designation;
   cout<<"Enter Salary:"<<endl;
   cin>>emp.salary;
   cout<<"Employee Details"<<endl;
    cout<<"Name of the Employee : " << emp.name <<endl;
    cout<<"ID of the Employee : "<< emp.empId<<endl;
    cout<<"Age of the Employee : "<< emp.age<<endl;
    cout<<"Designation of the Employee : "<< emp.designation<<endl;
   cout<<"Salary of the Employee : "<< emp.salary<<endl;
}