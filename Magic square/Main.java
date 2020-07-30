#include<iostream>
using namespace std;
int main()
  {
    int r,c,i,j,sum=0,sum2=0;
   
   cin>>r;
    int m1[r][r];
      
     for(i=0;i<r;i++)
    {
      for(j=0;j<r;j++)
      {
      cin>>m1[i][j];
      }
    }
    	   for(i=0;i<r;i++)
    {
      for(j=0;j<r;j++)
      {
     		if(i+j==r-1)
            {
              sum=sum+m1[i][j];
            }
      }
    }
    	   for(i=0;i<r;i++)
    {
      for(j=0;j<r;j++)
      {
     		if(i==j)
            {
              sum2=sum2+m1[i][j];
            }
      }
    }
   			if(sum==sum2)
            cout<<"Yes";
    		else
            {
            cout<<"No";
            }
    
    
  }