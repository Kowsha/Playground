#include<iostream>
using namespace std;
struct student
{
  int rollno;
  int sub[5];
  int total;
  float avg;
  int grade;
};
int main()
{
  int i,n,j;
  struct student s[20];
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cin>>n;
  for(i=0;i<n;i++)
  {
  cin>>s[i].rollno;
  cin>>s[i].sub[0]>>s[i].sub[1]>>s[i].sub[2]>>s[i].sub[3]>>s[i].sub[4];
    s[i].total=(s[i].sub[0]+s[i].sub[1]+s[i].sub[2]+s[i].sub[3]+s[i].sub[4]);
    s[i].avg=s[i].total/5;
  if(s[i].avg>70)
  {
    s[i].grade=1;
  }
  else if(s[i].avg>=50&&s[i].avg<=70)
  {
   s[i].grade=2;
  }
  else if(s[i].avg<50)
  {
    s[i].grade =3;
  }
  }
  cout<<"rn"<<" "<<"s1"<<" "<<"s2"<<" "<<"s3"<<" "<<"s4"<<" "<<"s5"<<" "<<"avg"<<" "<<"grade"<<endl;
  for(i=0;i<n;i++)
  {
  cout<<s[i].rollno<<" "<<s[i].sub[0]<<" "<<s[i].sub[1]<<" "<<s[i].sub[2]<<" "<<s[i].sub[3]<<" "<<s[i].sub[4]<<" "<<s[i].avg<<" "<<s[i].grade;
    cout<<endl;
  }
}