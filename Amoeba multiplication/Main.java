#include<iostream>
using namespace std;
int main()
{
  int n,i,a,n1=0,n2=1;
  cin>>n;
  for(i=3;i<=n;i++)
  { 
    a=n1+n2;
    n1=n2;
    n2=a;
  }
   cout<<a;
   return 0;
}