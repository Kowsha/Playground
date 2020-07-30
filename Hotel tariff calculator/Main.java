#include<iostream>
using namespace std;
int main()
{

  int m,rent,n;
   cin>>m;
   if(m>0 && m<13)
   {
   	   cin>>rent;
   		if(m==4 || m==5 || m==6 || m==11 || m==12)
   		{
     		int temp=(rent*20)/100;
    		 rent=rent+temp;
   		}
   		cin>>n;
   		cout<<n*rent;
   }
   else
   {
    cout<<"Invalid Input";
   }

}