#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[100];
   int vowelCounter = 0;
   cin.getline(str, 150);
   for(int i = 0; str[i]!='\0'; i++) {
      if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||
         str[i]=='o' || str[i]=='u' || str[i]=='A' ||
         str[i]=='E' || str[i]=='I' || str[i]=='O' ||
         str[i]=='U')
      {
         vowelCounter++;
      }
   }
   cout << "Number of vowels: " << vowelCounter;
   return 0;
 }