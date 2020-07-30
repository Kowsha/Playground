#include<iostream>
using namespace std;
int main()
{
  int a[100],n,i;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int oddSum=0,evenSum=0;
    for(i=0; i<n; i++){
        if(a[i]%2==0){
        evenSum=evenSum+a[i];
        }
    else{
             oddSum=oddSum+a[i];
        }
    }
    cout<<"\nThe sum of the even elements in the array is "<<evenSum;
  return 0;
}