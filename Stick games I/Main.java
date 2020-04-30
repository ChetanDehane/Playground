#include<iostream>
using namespace std;
void print(int res)
{
  if(res % 2 == 0)
    {
        cout <<"Mani Iyer";
    }
    else
    {
        cout <<"Arun Gupta";
    }
}
int main()
{
    int n, m, res;
    cin >> n >> m;
    if(n < m)
    {
        res = n;
    }
    else
    {
        res = m;
    }
  
  print(res);
    return 0;
}