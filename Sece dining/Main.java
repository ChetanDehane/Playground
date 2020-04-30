#include<iostream>
#include<string>
using namespace std;
int main()
{
  string door;
  int rail;
  cin>>door>>rail;
  if(door=="front")
  {
    if(rail==1)
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
  else 
  {
    if(rail==1)
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
  
 
  return 0;
}