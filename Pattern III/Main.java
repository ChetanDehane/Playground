#include<iostream>
using namespace std;
int main()
{
  int n,i,j,k;
  cin>>n;
 for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<i;
      for(k=1;k<i;k++)
      {
        if(k==j)
        {
         cout<<"*";
         break;
        }
      }
    }
    cout<<endl;
  } 
 
  for(i=n;i>=1;i--)
  {
    for(j=i;j>=1;j--)
    {
      cout<<i;
      for(k=i;k>1;k--)
      {
        if(k==j)
        {
        cout<<"*";
        break;
        }
      }
    }
    cout<<endl;
  }
  return 0;
}