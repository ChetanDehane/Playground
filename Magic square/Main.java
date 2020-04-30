#include<iostream>
using namespace std;
int main()
{
  int m,i,j;
  cin>>m;
  int a[m][m];
  for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
    cin>>a[i][j];
    }
  }

/* 

  int rowsum=0;
  for(i=0;i<m;i++)
  {
    rowsum=a[i][0];
    for(j=1;j<m;j++)
    {
     rowsum=rowsum+a[i][j];
    }
  }
  
  int columnsum=0;
  for(i=0;i<m;i++)
  {
    columnsum=a[0][i];
    for(j=1;j<m;j++)
    {
     columnsum=columnsum+a[j][i];
    }
  }
  
  if(rowsum==columnsum)
  {
   cout<<"Yes";
  }
  else
  {
   cout<<"No";
  }
 
  
*/ 
  
  int d1sum=0;
  for(i=0;i<m;i++)
    {
     d1sum=d1sum+a[i][i];
    }
  
   int d2sum=0;
  for(i=0;i<m;i++)
    {
     d2sum=d2sum+a[i][m-1-i];
    }
  
  if(d1sum==d2sum)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  return 0;
}


        