#include<iostream>
using namespace std;
int main()
{
  int m,n,sum,row=0,col=0,diag=0;
  cin>>m>>n;
  int mat[m][n];
  int i,j;
  for(i=0;i<m;i++){
    for(j=0;j<n;j++){
      cin>>mat[i][j];
    }
  }
  for(i=0;i<=0;i++){
    for(j=0;j<n-1;j++){
      row=row+mat[i][j];
    }
  }
  for(j=n-1;j==n-1;j--){
    for(i=1;i<m;i++){
      col=col+mat[j][i];
    }
  }
  for(i=0;i<m;i++){
    for(j=0;j<n;j++){
      if((i+j)==(m-1)){
        diag=diag+mat[i][j];
      }
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<diag+row+col;
  
}