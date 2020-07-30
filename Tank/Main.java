#include<iostream>
using namespace std;
int main(){
	int r,h,aw,n;
    cin>>r>>h>>aw>>n;
    int v = 3.14 * r * r * h;
  
  if(v < aw*n){
  	cout<<"The tank can be filled within "<<n<<" hours";
  }else{
  	cout<<"The tank cannot be filled within "<<n<<" hours";
  }
}