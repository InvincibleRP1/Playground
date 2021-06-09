#include <iostream>
using namespace std;

int main() 
{
  int i,n,key, f=0;
  cin >> n;
  int arr[n];
  for(i=0;i<n;i++)
  {
  	cin >> arr[i];
  }
  cin >> key;
  for(i=0;i<n;i++)
  {
  	if(arr[i]==key)
    {
      f=1;
    	cout << "index = " << i;
        
        break;
    }
   
  }
   if(f==0)
    {
    	cout << "-1";
    }
  return 0;
}