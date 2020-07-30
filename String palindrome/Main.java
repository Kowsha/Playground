#include <iostream>
#include <string.h>
using namespace std;
int main()
{
	char text[100];
	char temp;
	int isPalindrome = 1;
	cin >> text;
	int length = strlen(text); 
	for(int i=0; i<length; i++)
    {
		if(text[0+i] == text[(length-1)-i])
        {
			temp = text[0+i];
			text[0+i] = text[(length-1)-i];
			text[(length-1)-i] = temp;
		}
		else
        {
			isPalindrome = 0;
			break;
		}
	}
 	if(isPalindrome == 0)
		cout <<"Not a Palindrome" << endl;
	if(isPalindrome == 1)
		cout <<"Palindrome" << endl;
	return 0;
}