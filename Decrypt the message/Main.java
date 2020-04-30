#include<iostream>
using namespace std;
int main()
{
  int n,nt,a,b,i,sum=0;
  cin>>n>>nt;
  a=n+nt;
  for(i=1;i<a;i++)
  {
    b=a%i;
    if(b==0)
    {
      sum=sum+i;
    }
  }
  if(sum==a)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
  return 0;
}