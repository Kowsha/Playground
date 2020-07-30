#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int order(int x) 
{ 
    int n = 0; 
    while (x) 
    { 
        n++; 
        x = x/10; 
    } 
    return n; 
} 
int arm(int x)
{  
    int n = order(x); 
    int temp = x, sum = 0; 
    while (temp) 
    { 
        int r = temp%10; 
        sum += power(r, n); 
        temp = temp/10; 
    } 
   return (sum == x); 
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}