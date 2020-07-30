#include<iostream>
using namespace std;

int main()
{
    int m, n, sum = 0;
    cin >> m >> n;
    int i, j;
    int mat[m][n];
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat[i][j];
    }
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
        {
            if (i == 0) 
				sum += mat[i][j]; 
			else if (i == m - 1) 
				sum += mat[i][j]; 
			else if (j == 0) 
				sum += mat[i][j]; 
			else if (j == n - 1) 
				sum += mat[i][j]; 
        }
    }
    cout << "Sum of boundaries is " << sum << endl;
}