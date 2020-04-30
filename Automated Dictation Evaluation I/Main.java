#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str1[50],str2[50];
  cin>>str1>>str2;
  int result=strcmp(str1,str2);
  if(result==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
  return 0;
}