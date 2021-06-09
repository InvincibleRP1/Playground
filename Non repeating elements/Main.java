#include <iostream>
using namespace std;

int nonRepeating(int a[], int b[], int n, int m)
{
    int i, j, count = 0;

    for (i = 0; i < n; i++)
    {
        int flag = 0;
        for (j = 0; j < m; j++)
        {
            if (a[i] == b[j])
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            cout << a[i] << " ";
            count++;
        }
    }

    for (i = 0; i < m; i++)
    {
        int flag = 0;
        for (j = 0; j < n; j++)
        {
            if (b[i] == a[j])
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        {
            cout << b[i] << " ";
            count++;
        }
    }

    return count;
}

int main()
{
    int n, m, i;
    cin >> n >> m;
    int a[n], b[m];
    for (i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    for (i = 0; i < m; i++)
    {
        cin >> b[i];
    }
    int result = nonRepeating(a, b, n, m);
    cout << endl << result;

    return 0;
}