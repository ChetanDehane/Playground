#include<iostream>
using namespace std;
int main()
{
  int n,i,j,sum;
  cin>>n;
  for(i=1;i<=n;i++)
   {
      if(i%2==0)
      {
          j=2;
      }
      else
      {
          j=1;
      }
      sum=(i*i)-j;
      cout<<sum<<" ";
   }
  return 0;
}
