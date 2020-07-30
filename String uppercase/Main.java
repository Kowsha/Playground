#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[100];
  int i;
  cin>>str1;
  for(i=0;str1[i]!='\0';i++)
  {
    if(str1[i]>='a' && str1[i]<='z')
    {
      str1[i]=str1[i]-32;
    }
    }
  cout<<"String in uppercase is "<<str1;
}