#include<iostream>
using namespace std;
int maxelement(int a[],int n)
{   if (n == 1) 
        return a[0]; 
    return max(a[n-1], maxelement(a, n-1)); 
      
}

int main()
{
  int n,i,sum=0;
  cout<<"Enter the size of the array\n";
  cin>>n;
  int a[n];
    cout<<"Enter "<<n<<" elements of an array\n";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }

  cout<<"Maximum element in the array is "<<maxelement(a,n);


  
  
}