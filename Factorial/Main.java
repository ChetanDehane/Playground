#include<iostream>
using namespace std;

int fact(int n)
{
  if(n>1)
  {
    return n*fact(n-1);
  }
  else
  {
    return 1;
    
  }
}
  
int main()
{
  int n;
  cin>>n;
  fact(n);
  cout<<"The factorial of "<<n<<" is "<<fact(n);
  return 0;
}