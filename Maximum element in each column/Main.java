#include<iostream>
#include<limits.h>
using namespace std;
void maxi_col(int mat[][100], int m, int n)
{
    int i,j;
    for(i = 0; i < n; i++)
    {
        int max = mat[0][i];
        for(j = 1; j < m; j++)
        {
            if(mat[j][i] > max)
            {
                max = mat[j][i];
            }
        }
        cout << max << endl;
    }
}
int main()
{
    int i, j,m,n;
    int mat1[100][100];
   cin>>m>>n;
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat1[i][j];
    }
    maxi_col(mat1,m,n);
    return 0;
}