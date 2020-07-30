#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[20];
  int i;
  cin>>str;
  for(i=0;i<=strlen(str);i++)
  {
	    if(str[i]>=65 && str[i]<=91)
	    {
		str[i]=str[i]+32;
	    }
  }
  cout<<"String in lowercase is "<<str;
  return 0;
}