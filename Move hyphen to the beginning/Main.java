#include<bits/stdc++.h> 
using namespace std;
int main()
{
    char a[40];
  cin.getline(a,40);
    int n=strlen(a)-1;
  int count = n;
 int i;
    //MoveSpace(a,0,strlen(a)-1);
  
   
    for(i=n;i>=0;i--)
    {
        if(a[i] != '-')
        a[count--] = a[i];
    }
     
    while(count>=0)
        a[count--] = '-';
    cout << a << endl;
  
    return 0;
}