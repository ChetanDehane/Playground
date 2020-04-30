#include<iostream>
#include<cstdlib>
using namespace std;
int i,j;
int** createArray(int r,int c)
{
  int **a=(int **)malloc(r*sizeof(int*));
  for(i=0;i<r;i++)
  *(a+i)=(int *)malloc(c*sizeof(int));
  return a;
}
int getElement(int **a,int **b,int r,int c)
{
 for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {
   cin>>a[i][j];
  }
}
for(i=0;i<r;i++)
{
  for(j=0;j<c;j++)
  {
    cin>>b[i][j];
  }
} 
}

int addMatrix(int **a,int **b,int **sum,int r,int c)
{
  for(i=0;i<r;i++)
   {
    for(j=0;j<c;j++)
     {
       sum[i][j]=a[i][j]+b[i][j];
      cout<<sum[i][j]<<" ";
     }
     cout<<"\n";
   }
}

int main()
{
  int **a;
  int **b;
  int **sum;
  int r,c;
  cin>>r>>c;
  a=createArray(r,c);
  b=createArray(r,c);
  sum=createArray(r,c);
  getElement(a,b,r,c);
  addMatrix(a,b,sum,r,c);
  return 0;
}