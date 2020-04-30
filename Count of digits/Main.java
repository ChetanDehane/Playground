#include<iostream>
using namespace std;
int main()
{
  int n,a,i=0;
  cin>>n;
  do
  {
    a=n%10;
    i++;
    n=n/10;
  }while(n>0);
 
  cout<<i;
}