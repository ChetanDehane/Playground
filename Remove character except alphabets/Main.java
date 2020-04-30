#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string str,alpha={"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"};
  cin>>str;
  int i,j;
  for(i=0;i<str.length();i++)
  {
    for(j=0;j<alpha.length();j++)
    {
      if(str[i]==alpha[j])
      {
        cout<<str[i];
      }
      else
      {
        continue;
      }
    }
  }
  return 0;
}