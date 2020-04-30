#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,max;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
    cin>>a[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    max=a[0][i];
    for(j=0;j<m;j++)
    {
      if(a[j][i]>max)
      {
        max=a[j][i];
      }
      
    }
    cout<<max<<"\n";
    }
  return 0;
  }
        
