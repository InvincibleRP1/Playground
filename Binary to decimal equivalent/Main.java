#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    int n, i, m, number=0, k;
    cin >> n;
    while(n>0)
    {
        k = n % 2;
        m = k * pow(2, i);
        i++;
        number = number + m;
        n=n/10;
    }

    cout << number;
    return 0;
}