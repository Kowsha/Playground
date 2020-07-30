#include <iostream>
using namespace std;
int main() {
    int convertFromCopy, digit, convertTo;
    unsigned int convertFrom;
    string stringDigit, answer;
    cout << "Enter the value of n"<<endl;
    cin >> convertFrom;
    cout << "Enter the base to which you want to convert"<<endl;
    cin >> convertTo;
    convertFromCopy = convertFrom;
    while (convertFrom != 0){
        digit = convertFrom % convertTo;
        if (digit < 10)
            stringDigit = '0' + digit;
        else
            stringDigit = digit - 10 + 'A';

        answer = stringDigit + answer;

        convertFrom /= convertTo;                
    }
    cout << "The number in base "<< convertTo << " is " << answer;
    return 0;
}