#include<iostream>
using namespace std;
int main ()
{
  int n,i=1,sum=11,series;
  cin>>n;
  while(i<=n)
  {
   series=sum*sum;
   cout<<series<<" ";
   sum=sum+4;
   i++;
  }
  return 0;
}