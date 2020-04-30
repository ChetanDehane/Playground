#include<iostream>
using namespace std;
int main()
{
  int total_st,i,sum=0;
  cin>>total_st;                    
  for(i=1;i<=total_st-1;i++)            // formula for handshake n=(total_st*(total_st-1))/2         
  {
    sum=sum+i;
  }
  cout<<sum;
  return 0;
}