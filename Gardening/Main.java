#include<iostream>
using namespace std;
int main(){

 int r,c,tno;
  cin>>r;
  cin>>c;
  cin>>tno;
  int t=r*c;
  if((r<tno  && tno<=(r+r)) || ((t-(r+r))<tno &&  tno<=(t-r))  )
    cout<<"It is an orange tree";
  else
   cout<<"It is not an orange tree";

}
