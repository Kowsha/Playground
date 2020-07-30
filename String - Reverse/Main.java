#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 char str[100],temp;
  gets(str);
  int i,j;
  j=strlen(str)-1;
  while(i<j)
  {
    temp=str[i];
    str[i]=str[j];
    str[j]=temp;
    i++;
    j--;
  }
  cout<<"The reversed String is "<<str<<".";
}