#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100],str1[100];
  gets(str);
  strcpy(str1,str);
  cout<<"The copied string is "<<str1;
}