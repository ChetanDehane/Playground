#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
 string str;
 getline(cin,str);
 for(auto i=str.crbegin();i<str.crend();i++)
 {
   cout<<*i;
 }
  return 0;
}