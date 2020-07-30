#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100],str1[100];
  gets(str);
  gets(str1);
  if(strcmp(str1,str)==0)
    cout<<"Strings are same";
  else
    cout<<"Strings are not same";
}