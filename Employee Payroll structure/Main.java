#include<iostream>
using namespace std;
struct employee
{
  int empid;
  char name[20];
  int salary;
  int hra;
  int da;
  int med;
  int pf;
  int ins;
};
int main()
{
int i,n,j,gsalary=0,eno,calc=0,netsalary;
  struct employee emp[20];
  cout<<"Enter the number of employees:"<<endl;
  cin>>n;
  cout<<"Enter your input for every employee:"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>emp[i].empid>>emp[i].name>>emp[i].salary>>emp[i].hra>>emp[i].da>>emp[i].med>>emp[i].pf>>emp[i].ins;
  }
  cout<<"Employee ID:"<<endl;
  cin>>eno;
  cout<<"Employee Name:"<<endl;
  cout<<"Basic Salary, HRA:"<<endl;
 cout<<"DA, Medical Allowance:"<<endl;
 cout<<"PF and Insurance:"<<endl;
 cout<<"Employee ID:"<<endl;
 cout<<"Employee Name:"<<endl;
 cout<<"Basic Salary, HRA:"<<endl;
 cout<<"DA, Medical Allowance:"<<endl;
 cout<<"PF and Insurance:"<<endl;
 cout<<"Enter employee ID to get payslip:"<<endl;
  for(i=0;i<n;i++)
  {
    if(emp[i].empid==eno)
    {
      cout<<"Salary Slip of "<<emp[i].name<<endl;
      cout<<"Employee ID: "<<emp[i].empid<<endl;
      cout<<"Basic Salary: "<<emp[i].salary<<endl;
      cout<<"House Rent Allowance: "<<emp[i].hra<<endl;
      cout<<"Dearness Allowance: "<<emp[i].da<<endl;
      cout<<"Medical Allowance: "<<emp[i].med<<endl;
      gsalary=emp[i].hra+emp[i].salary+emp[i].da+emp[i].med;  
      cout<<"Gross Salary: "<<gsalary*12<<" Rupees"<<endl;
      cout<<"Deductions: "<<endl;
      cout<<"Provident fund: "<<emp[i].pf<<endl;
      cout<<"Insurance: "<<emp[i].ins<<endl;;
      calc=(emp[i].pf+emp[i].ins)*12;
      netsalary=(gsalary*12)-calc;
      cout<<"Net Salary: "<<netsalary<<" Rupees"<<endl;
    }
  }
}