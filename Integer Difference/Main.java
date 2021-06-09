#include <iostream>
using namespace std;

int main() 
{
   int k,n,m,i;
   cin >> k;
   int arr[k];
   
   for(i=0;i<k;i++)
   {
   	cin >> arr[i];
   }
  cin >> n >> m;
   for(i=0;i<k;i++)
   {
   	if(arr[i]-n < m)
    {
    	arr[i]++;
    }
   }
  for(i=0;i<k;i++)
  {
  	cout << arr[i] << " ";
  }
  return 0;
}