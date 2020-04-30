#include<iostream>
using namespace std;
int main()
{
  int n,i=1;
  float sum=0.5;
  cin>>n;
  while(i<=n)
  {
    cout<<sum<<" ";
    sum=sum*3;
    i++;
  }
  return 0;
}