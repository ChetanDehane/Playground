#include<iostream>
using namespace std;
int main()
{
  int age;
  float show_time ;
  cin>>age>>show_time;
  if(age<13)
  {
    if(show_time<12.00)
    {
      cout<<"$4.00";
    }
    else
    {
      cout<<"$2.00";
    }
  }
  else if(age>13&&show_time<12.00)
  {
    cout<<"$8.00";
  }
  else
  {
    cout<<"$5.00";
  }
  return 0;
}
    
    
      
  