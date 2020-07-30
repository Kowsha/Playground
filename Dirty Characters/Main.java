#include <iostream> 
#include <cstdlib> 
#define NO_OF_CHARS 256 
  using namespace std;

int *getCharCountArray(char *str) 
{ 
   int *count = (int *)calloc(sizeof(int), NO_OF_CHARS); 
   int i; 
   for (i = 0; *(str+i);  i++) 
      count[*(str+i)]++; 
   return count; 
} 

char *removeDirtyChars(char *str, char *mask_str) 
{ 
  int *count  = getCharCountArray(mask_str); 
  int ip_ind  = 0, res_ind = 0; 
  while (*(str + ip_ind)) 
  { 
    char temp = *(str + ip_ind); 
    if (count[temp] == 0) 
    { 
        *(str + res_ind) = *(str + ip_ind); 
        res_ind++; 
    } 
    ip_ind++; 
  }     
  
 
  *(str+res_ind) = '\0';     
  
  return str; 
} 

int main() 
{ 
    char str[20]; 
  cin.getline(str, 20); 
    char mask_str[20];
  cin.getline(mask_str, 20); 
    cout<<removeDirtyChars(str, mask_str); 
    return 0; 
}