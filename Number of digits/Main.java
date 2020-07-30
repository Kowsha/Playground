#include<iostream>
using namespace std;
int main() 
{
     int num, count = 0;
    cout << "Enter the value of n\n";
    cin  >> num;
     int temp=num;
    while (num > 0) {
        num = num / 10;
        count++;
    }
    
    cout << "The number of digits in "<<temp<<" is " <<count;
    return 0;
}