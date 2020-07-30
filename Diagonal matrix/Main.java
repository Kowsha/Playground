#include <bits/stdc++.h>
using namespace std;
bool ifdiagonal(int arr[100][100], int r){
   for (int i = 0; i < r; i++)
   for (int j = 0; j < r; j++)

   if ((i != j) && (arr[i][j] != 0))
      return false;
      return true;
}
int main(){
   int r;
   int arr[100][100];
  cin>>r;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<r;j++)
    {
      cin>>arr[i][j];
    }
  }
   if (ifdiagonal(arr,r))
      cout << "Yes" << endl;
   else
      cout << "No" << endl;
   return 0;
}