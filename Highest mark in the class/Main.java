#include<iostream>
using namespace std;
int main()
{
  int n,i,max;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n-1;i++)
  {
    if(a[i]>a[i+1])
    {
      max=a[i];
      a[i]=a[i+1];
      a[i+1]=max;
    }
    else
    {
      max=a[i+1];
    }
  }
 cout<<max;
  return 0;
}
