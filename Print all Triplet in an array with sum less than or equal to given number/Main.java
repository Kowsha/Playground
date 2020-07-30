#include <iostream>
#include <algorithm>
using namespace std;


void printAllTriplets(int A[], int n, int sum)
{
	
	sort(A, A + n);

	for (int i = 0; i <= n - 3; i++)
	{
		int low = i + 1, high = n - 1;

	
		while (low < high)
		{
			
			if (A[i] + A[low] + A[high] > sum)
				high--;

			else
			{
				
				for (int x = low + 1; x <= high; x++)
					cout << "(" << A[i] << ", " << A[low] << ", " << A[x] << ")"<<endl;

				low++;  
			}
		}
	}
}

int main()
{
	int A[50],sum,n;
	cin>>n;
  for(int i=0;i<n;i++){
    cin>>A[i];
  }
  	cin>>sum;
	printAllTriplets(A, n, sum);

	return 0;
}