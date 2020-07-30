#include<iostream>
 
using namespace std;
 
int main()
{
	int i, v, e, j, count;
 
	
	cout<<"Enter the number of vertices: ";
	cin>>v;
	cout<<"\nEnter the number of edges: ";
	cin>>e;
	int edge[e][2];
 
	
	for(i = 0; i < e; i++)
	{
		cout<<"\nEnter the Start node and End node of edge "<<i+1;
		
		cin>>edge[i][0];
		
		cin>>edge[i][1];
	}
 
	
	cout<<"\nAdjacency List: ";
	for(i = 0; i < v; i++)
	{
		count = 0;
		
		cout<<"\n"<<i<<"--->";
		for(j = 0; j < e; j++)
		{
			if(edge[j][0] == i)
			{
				cout<<edge[j][1]<<" ";
				count++;
			}
			else if(edge[j][1] == i)
			{
				cout<<edge[j][0]<<" ";
				count++;
			}
			else if(j == e-1 && count == 0)
				cout<<"";
		}
		
	}
}