#include<iostream>
using namespace std;
int main()
{
  int r1,r2,i,j,a,sum=0;
  cin>>r1>>r2;
  for(i=r1;i<=r2;i++)
  {
    for(j=1;j<i;j++)
    {
      a=i%j;
      if(a==0)
      {
         sum=sum+j;
      }
    }
      if(sum==i)
      {
        cout<<i<<" ";
      }
    sum=0;
  }
  return 0;
}