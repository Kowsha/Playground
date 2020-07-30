#include <iostream>
#include <bitset>
using namespace std;

int swap(int n, int p, int q)
{
	if (((n & (1 << p)) >> p) ^ ((n & (1 << q)) >> q))
	{
		n ^= (1 << p);
		n ^= (1 << q);
	}
	return n;
}

int main()
{
	int n;
  cin>>n;
	int p ,q;  
cin>>p>>q;
	
	int a = swap (n, p, q);
	cout << a <<endl<< bitset<8>(n) << endl;

	return 0;
}