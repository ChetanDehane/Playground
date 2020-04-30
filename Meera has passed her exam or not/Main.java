#include<iostream>
using namespace std;
int main()
{
  int n,mn,i,flag=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>mn;
  for(i=0;i<n;i++)
  {
    if(a[i]==mn)
    {
     flag=1;
      break;
    }
  }
  if(flag==1)
  {
    cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  }
 
  return 0;
}
