#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
    cin>>a[i][j];
    }
  }
  
  cout<<"Sum of rows is ";
  int temp=0,max=0,rowsum=0;
  for(i=0;i<m;i++)
  {
    rowsum=a[i][0];
    for(j=1;j<n;j++)
    {
     rowsum=rowsum+a[i][j];
    }
     if(rowsum>temp)
    {
      temp=rowsum;
      max++;
    }
     cout<<rowsum<<" ";
  }
  cout<<"\nRow "<<max<<" has maximum sum"<<endl;
  
  
  cout<<"Sum of columns is ";
  int temp1=0,max1=0,columnsum=0;
  for(i=0;i<m;i++)
  {
    columnsum=a[0][i];
    for(j=1;j<n;j++)
    {
     columnsum=columnsum+a[j][i];
    }
     if(columnsum>temp1)
    {
      temp1=columnsum;
      max1++;
    }
     cout<<columnsum<<" ";
  }
  cout<<"\nColumn "<<max1<<" has maximum sum"<<endl;
  return 0;
}
        