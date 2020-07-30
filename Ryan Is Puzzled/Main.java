#include<iostream>
int main()
{
    // Type your code here
int r,c,a[20][20],b[20][20];
std::cin>>r>>c;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  for(int i=0;i<c;i++){
    for(int j=0;j<r;j++){
      std::cout<<a[j][i]<<" ";
    }
    std::cout<<std::endl;;
  }
  	return 0;
}