#include<iostream>
using namespace std;
int mul(int, int);
int main()
{
  int m,n,s,req;
  cin>>m>>n>>req;
  if(req<=mul(m,n))
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}
int mul(int a,int b)
{
   int c=1;
  while(b!=0)
  {
    c=c*a;
    b--;
  }
  return c;
}
   