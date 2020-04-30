#include<iostream>
using namespace std;
int main()
{
  int no1,no2,no3,gcd=1,i=1;
  cin>>no1>>no2>>no3;
  while(i<=no1&&i<=no2&&i<=no3)
  {
    if(no1%i==0&&no2%i==0&&no3%i==0)
    {
      gcd=i;
      
    }
    i++;
  }
    
  
  if((no1>no2&&no1<no3)||(no1>no3&&no1<no2))
  {
    cout<<"The treasure is in box which has number "<<no1;
  }
  else if((no2>no1&&no2<no3)||(no2>no3&&no2<no1))
  {
    cout<<"The treasure is in box which has number "<<no2;
  }
  else 
  {
    cout<<"The treasure is in box which has number "<<no3;
  }
  cout<<"\nThe code to open the box is "<<gcd;
  return 0;
}