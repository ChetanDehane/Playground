#include<iostream>
using namespace std;

int gcd(int n1,int n2,int n3)
{
  int small=0,GCD=0;  
    
  if(n1<n2&&n1<n3)
  {
    small=n1;
  }
  else if(n2<n1&&n2<n3)
  {
    small=n2;
  }
  else
  {
    small=n3;
  }
  
  while(small>=1)
  {
    if(n1%small==0&&n2%small==0&&n3%small==0)
     {
       GCD=small;
        break;
    }
    small--;
  }
  return GCD;
  
}

int main()
{
  int n1,n2,n3,n4;
  cin>>n1>>n2>>n3>>n4;
  
  if(gcd(n1,n2,n3)==n4)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
  return 0;
}