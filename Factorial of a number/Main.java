#include<iostream>
using namespace std;
int main()
{
  int no,fact=1,i;
  cin>>no;
  for(i=1;i<=no;i++)
  {
    fact=fact*i;
  }
  cout<<fact;
  return 0;
}