#include <bits/stdc++.h> 
#include<iostream>
using namespace std; 
  
string maximumPalinUsingKChanges(string str, int k) 
{ 
   	string palin = str; 
  
    int l = 0; 
    int r = str.length() - 1; 
  
    while (l < r) 
    { 
       
        if (str[l] != str[r]) 
        { 
            palin[l] = palin[r] = max(str[l], str[r]); 
            k--; 
        } 
        l++; 
        r--; 
    } 
  

  if (k < 0) 
        return "-1"; 
  
    l = 0; 
    r = str.length() - 1; 
  
    while (l <= r) 
    { 
        
        if (l == r) 
        { 
            if (k > 0) 
                palin[l] = '9'; 
        } 
  
        if (palin[l] < '9') 
        { 
           
            if (k >= 2 && palin[l] == str[l] && 
                palin[r] == str[r]) 
            { 
                k -= 2; 
                palin[l] = palin[r] = '9'; 
            } 
  
            else if (k >= 1 && (palin[l] != str[l] || 
                                palin[r] != str[r])) 
            { 
                k--; 
                palin[l] = palin[r] = '9'; 
            } 
        } 
        l++; 
        r--; 
    } 
  
    return palin; 
} 
int main() 
{ 
  int n,k;
  cin>>n;
  cin>>k;
    string str;
  for(int i = 0 ; i  < str.length()-1 ; i++){
  	cin>>str;
  } 
    cout << maximumPalinUsingKChanges(str, k); 
    return 0; 
} 