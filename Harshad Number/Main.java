#include<iostream>
using namespace std;
int main()
{
  int n,a,b=0,temp;
  cin>>n;
  temp=n;
  while(n>0)
  {
    a=n%10;
    b=b+a;
    n=n/10;
  }
  if(temp%b==0)
    cout<<"Harshad Number";
  else  
    cout<<"Not Harshad Number";
  
  return 0;
}