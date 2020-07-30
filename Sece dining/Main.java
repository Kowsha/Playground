#include<iostream>
#include<cstring>
using namespace std;
int main()
{
 char str[10];
  int rail;
  cin>>str>>rail;
  if((strcmp(str,"rear") == 0)){
  	if(rail == 1)
      cout<<"Right Handed";
     else
       cout<<"Left Handed";
    
  }
    else if((strcmp(str,"front")==0)){
    	if(rail ==1)
          cout<<"Left Handed";
        else
          cout<<"Right Handed";
    }else{
    	cout<<"Right Handed";
    }
}