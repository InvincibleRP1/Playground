#include <bits/stdc++.h>
using namespace std;

int main() 
{
   char a[100];
   cin >> a;
   int len = strlen(a) - 1;
   int i, count = len;
   for(i=len;i>=0;i--)
   	{
   	  if(a[i]!='-')
      {
      a[count--]=a[i];
      }
   }
     while(count>=0)
     a[count--]='-';
     
  cout << a;
  return 0;
}