#include <iostream>
#include <string.h>
using namespace std;

void ReplaceCharacter(char str[], int len, char ch1, char ch2)
{
  int i;
  for (i=0; i<len; i++)
  {
    if(str[i] == ch1)
    {
      str[i] = ch2;
    }
    else if(str[i] == ch2)
    {
     str[i] = ch1;
    }
    
  }
  cout << str;
  
}

int main() 
{
  char s[100];
  char a, b;
  int n;
  cin >> s >> a >> b;
  n = strlen(s);
  ReplaceCharacter(s, n, a, b);
  return 0;
}