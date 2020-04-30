#include<iostream>
using namespace std;
int main()
{
  int n,a,b,c,r,temp,sum=0,count=0;
  cin>>n;
  a=n*n;
  temp=a;
  while(a>0)
  {
    a=a/10;
    count++;
  }
  
  if(count%2==0)
   {
     int i=0;
     while(i<(count/2))
     {
      b=temp%10;
      sum=sum*10+b;
      temp=temp/10;
      i++;
     }
       r=0;
       while(sum>0)
        {
            c=sum%10;
            r=r*10+c;
            sum=sum/10;
        }
    r=r+temp;
    
  }
   else
  { 
    int i=0;
    while(i<(count/2+1))
    {
      b=temp%10;
      sum=sum*10+b;
      temp=temp/10;
      i++;
    }
       r=0;
       while(sum>0)
        {
            c=sum%10;
            r=r*10+c;
            sum=sum/10;
        }
    r=r+temp;
    
  }
  
      if(r==n)
      {
        cout<<"Kaprekar Number";
      }
  else
    cout<<"Not a Kaprekar Number";
  return 0;
}
