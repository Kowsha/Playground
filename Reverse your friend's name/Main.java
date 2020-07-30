#include<iostream>
#include<cstring>
using namespace std;
void reverse(char s[]) {
   int len = strlen(s) ;
   int i, j;
   for (i = 0, j = len - 1; i < j; i++, j--) {
      swap(s[i], s[j]);
   }
}
int main() {
   char s[20] ;
     cin.getline(s,20);

   reverse(s);
   cout  << s <<endl;
}

