#include<iostream>
using namespace std;
int main()
{
  int birth_year,current_year;
  cin>>birth_year>>current_year;
  int age=(current_year+2000)-(birth_year+1900);
  int age1=(current_year+2000)-(birth_year+2000);
  if(age>0&&age<=100)
    {
  cout<<age;
    }
  else 
    cout<<age1;
  return 0;
  }
