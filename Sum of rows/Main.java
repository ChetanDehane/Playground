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
  
    int sum=0;
  for(i=0;i<m;i++)
  {
    sum=a[i][0];
    for(j=1;j<n;j++)
    {
     sum=sum+a[i][j];
    }
     cout<<sum<<endl;
  }
  return 0;
}
        
