#include<iostream>
#include<cstring>
using namespace std;
int most_frequent(char *string){
     int count[256] = {0}; // Assum char is ASCII
     int max = 0;
     int i;

     for(i=0; i < strlen(string) ;i++) {
         count[(unsigned char)(string[i])] ++;
     }

     for(i=0; i < 256 ;i++) {
         if (count[i] > max) 
             max = count[i];
     }
     return max;
 }
int main(){
	char str[50];
    cin>>str;
  cout<<most_frequent(str);
}