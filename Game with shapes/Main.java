#include<iostream>
using namespace std;
int main()
{
  int radius,length_square;
  cin>>radius>>length_square;
  int diameter = 2*radius;
  if(diameter<=length_square)
  {
   cout<<"circle can be inside a square"; 
  }
  else
  {
   cout<<"circle cannot be inside a square"; 
  }
  return 0;
}