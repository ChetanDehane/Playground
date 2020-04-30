#include<iostream>
#include<cstdlib>
using namespace std;
int sumZigZag(int r,int c,int **a)
{
  int i,j,sum=0;
  for(i=0;i<r;i++)
  {
      for(j=0;j<c;j++)
      {
        if((j<c-1)&&(i==0))
        {
         sum=sum+a[i][j];
        }  
        else if((j<c-1)&&(i==r-1))
        {
          sum=sum+a[i][j+1];
        }
       }
   }
  
 for(i=0;i<r;i++)
  {
    sum=sum+a[i][r-1-i];
  } 
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}
  
int main()
{
   int r,c,i,j;
  cin>>r>>c;
  int **a=(int **)malloc(r*sizeof(int*));
  for (int i=0;i<r;i++)
		a[i]=(int *)malloc(c*sizeof(int));
  
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
       cin>>a[i][j];
    }
  }
  
  sumZigZag(r,c,a);
  for (int i=0;i<r;i++)
		free(a[i]);
	free(a);
  return 0;
}