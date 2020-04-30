#include<iostream>
using namespace std;

int gcd(int n1,int n2,int small)
{
  if(n1%small==0&&n2%small==0)
  {
    return small;
  }
  else
  {
     return gcd(n1,n2,small-1);
  }

}

    
    
  
int main()
{
  int n1,n2,small;
  cin>>n1>>n2;
  if(n1<n2)
  {
    small=n1;
  }
  else
  {
    small=n2; 
  }
  cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd(n1,n2,small);
  return 0;
}