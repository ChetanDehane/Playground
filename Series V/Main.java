#include<iostream>
using namespace std;
int main()
{
  int n,i,series,no=11;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    series=no*no;
    cout<<series<<" ";
    no=no+4;
  }
  return 0;
}