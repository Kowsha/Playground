#include<iostream>
int main()
{
    // Type your code here
  int r,c,a[20][20],b[20][20],sum[20][20],i,j;
  std::cin>>r>>c;
  for(int i=0;i<r;++i)
    for(int j=0;j<c;++j)
    {
      std::cin>>a[i][j];
    }
  for(int i=0;i<r;++i)
    for(int j=0;j<c;++j){
      std::cin>>b[i][j];
    }
  for(int i=0;i<r;++i)
    for(int j=0;j<c;++j){
      sum[i][j]=a[i][j]+b[i][j];
    }
  for(int i=0;i<r;++i)
  {
    for(int j=0;j<c;++j)
  std::cout<<sum[i][j]<<" ";
    std::cout<<std::endl;
    }
  return 0;
}