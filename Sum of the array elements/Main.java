#include<iostream>
using namespace std;
int arraySum(int[], int);
int main()
{
int sum = 0,a[100];
int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
sum = arraySum(a, 7);
cout<<sum<<endl;
return 0;
}
int arraySum(int a[], int count){
static int index=0;
static int sum=0;
sum += a[index];
if(index==count-1){
return sum;
}
else{
index++;    
arraySum(a, count);
}  
}