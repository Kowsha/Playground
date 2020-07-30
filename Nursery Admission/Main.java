#include<iostream>
#include<string.h>
using namespace std;
int main()
{
   char str[100];
  int len;
  gets(str);
  len=strlen(str);
  cout<<"The number of letters in the name is "<<len;
}