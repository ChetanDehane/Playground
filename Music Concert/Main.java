#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n,i,bcount=0,gcount=0;
  cin>>n;
  int *a=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
    {
      gcount++;
    }
    else
    {
      bcount++;
    }
  }
  cout<<bcount<<"\n"<<gcount;
  
  return 0;
}