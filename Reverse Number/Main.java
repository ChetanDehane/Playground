#include <iostream>
using namespace std;
int main() 
{
  int n,a;
  cin>>n;
  while(n>0)
  {
   a=n%10;
    if(a==0)
    {
      n=n/10;
    }
    else
    {
       cout<<a;               // instead of cout<<a statement when can use
        n=n/10;               // sum=sum*10+a;  for this we have to declare
    }                         //  sum as a int sum=0  and for result we have 
                              //  to print sum outside the loop.
    
    
  }
	return 0;
}