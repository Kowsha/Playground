#include <bits/stdc++.h>
using namespace std;
bool check_lower_triangular_matrix(int mat[100][100],int n)
{
 for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(mat[i][j]!=0)
          return false;
      }
    }
    return true;
}
int main()
{
    int N;
    cin>>N;
  int mat[100][100];
  int i, j;
  for(i = 0; i < N; i++)
  {
    for(j = 0; j < N; j++)
       cin >> mat[i][j];
    }
if (check_lower_triangular_matrix(mat,N))
   cout << "Lower Triangular Matrix";
 else
    cout << "Not a Lower Triangular Matrix";
    return 0;
}