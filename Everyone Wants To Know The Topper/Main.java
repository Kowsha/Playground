#include<iostream>
int main()
{
  // Type your code here
  int n,larg;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    std::cin>>a[i];
  }
  larg=a[0];
  for(int i=1;i<n;i++){
    if(larg<a[i]){
      larg=a[i];
    }}
   std::cout<<larg; 
    return 0;
}