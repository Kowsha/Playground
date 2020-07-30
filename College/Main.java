#include<iostream>
using namespace std;
struct st
{ 
char name[100];
char city[100];
int establishmentYear;
float passPercentage;
};
int main()
{
int n,i,j;
cout<<"Enter the number of colleges"<<endl;
cin>>n;
struct st c[n];
for(i=1;i<=n;i++)
{
cout<<"Enter the details of college "<<i<<endl;
cout<<"Enter name"<<endl;
cin>>c[i].name;
cout<<"Enter city"<<endl;
cin>>c[i].city;
cout<<"Enter year of establishment"<<endl;
cin>>c[i].establishmentYear;
cout<<"Enter pass percentage"<<endl;
cin>>c[i].passPercentage;
}
cout<<"Details of colleges"<<endl;
for(i=1;i<=n;i++)
{
cout<<"College:"<<i<<endl;
cout<<"Name:"<<c[i].name<<endl;
cout<<"City:"<<c[i].city<<endl;
cout<<"Year of establishment:"<<c[i].establishmentYear<<endl;
cout<<"Pass percentage:"<<c[i].passPercentage<<endl;
  
}
}
