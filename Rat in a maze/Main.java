#include<iostream>
#include<queue>

using namespace std;
int visited[11][11];
int DD[]={0,-1,0,1};
int DC[]={1,0,-1,0};
int n,m,matrix[11][11];
int ans=0;

void call_it(int x,int y)
{
    if(matrix[x][y]==1) return ;
    if(x==n-1&&y==n-1) {ans++;}
 for(int i=0;i<4;i++)
 {  int a=x+DD[i],b=y+DC[i];
     if(a<n&&a>=0&&b<n&&b>=0&&!matrix[a][b]&&!visited[a][b])
     {
         visited[a][b]=1;
          call_it(a,b);
          visited[a][b]=0;
     }
 }
  return ;
}
int main()
{
cin>>n;
   for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    {
     cin>>matrix[i][j];
    }
}
call_it(0,0);
cout<<ans<<endl;
  return 0;
}