#include <stdio.h>
int main()
{
  int a[100][100];
  int n=0,i,j,cnt=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      scanf("%d",&a[i][j]);
      if(a[i][j]%2==0)
        cnt++;
    }
  }
  if(cnt==n*n||cnt==0)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
 return 0;
}