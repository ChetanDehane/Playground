#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string input;
  getline(cin,input);
  int i=0;
  string b={"the"};
 
  while(input.find(b)!=-1)
  {
    input.erase(input.find(b),b.size()+1);
  }
  cout<<input;
   
  return 0;  
}
  
