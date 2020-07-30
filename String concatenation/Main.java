#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str[100],str1[100];
  gets(str);
  gets(str1);
  cout<<"The concatenated string is "<<strcat(str,str1);
}