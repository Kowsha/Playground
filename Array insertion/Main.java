#include<iostream>
using namespace std;
int main()
{
	int arr[50], size, insert, i, pos;
    cout<<"Enter the number of elements in the array"<<endl;
	cin>>size;
    cout<<"Enter the elements in the array"<<endl;
	for(i=0; i<size; i++)
	{
		cin>>arr[i];
	}
    cout<<"Enter the location where you wish to insert an element"<<endl;
    cin>>pos;
   if(pos<=size)
   {
    cout<<"Enter the value to insert"<<endl;
	cin>>insert;
    cout<<"Array after insertion is"<<endl;
	for(i=size; i>pos-1; i--)
	{
		arr[i]=arr[i-1];
	}
	arr[pos-1]=insert;
	for(i=0; i<size+1; i++)
	{
		cout<<arr[i]<<endl;
	}
   }
  else
  {
    cout<<"Invalid Input";
  }
}