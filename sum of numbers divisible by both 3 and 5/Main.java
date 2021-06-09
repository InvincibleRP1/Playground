#include <iostream>
using namespace std;

int Calculate(int m, int n)
{
  int i,sum;
  for(i=m;i<=n;i++)
  {
  	if(i%3==0 && i%5==0)
    {
    	sum = sum + i;
    }
  }
  return sum;
}

int main() 
{
  int m,n;
  cin >> m >> n;
  cout << Calculate(m,n);
  return 0;
}