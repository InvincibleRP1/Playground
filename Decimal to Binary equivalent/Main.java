#include <iostream>
using namespace std;


int main() 
{
   int n, arr[10], i = 0;
   cin >> n;
   while(n>0)
   {
   	arr[i++] = n%2;
    n = n/2;
   }
  for(i=i-1;i>=0;i--)
  {
  	cout << arr[i];
  }
  return 0;
}
