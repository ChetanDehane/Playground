#include<iostream>
using namespace std;
int main()
{
  int target,n,sum=0,count=0;
  cin>>target;
  while(1)
  {
    cin>>n;
    sum=sum+n;
    count++;
     if(sum>=target)
     {
       cout<<"The number of turns is "<<count;
       break;
     }
  }
  return 0;
}
    
  