#include<iostream>

int main()
{
  int x,y,r;
  float total_interest_in_rs,total_amount_in_rs,discount_on_interest_in_rs,final_settlement;
  std::cin>>x>>y>>r;
  total_interest_in_rs=(r*y*x)/100;
  total_amount_in_rs= x+total_interest_in_rs;
  discount_on_interest_in_rs=(2*total_interest_in_rs)/100;
  final_settlement=total_amount_in_rs-discount_on_interest_in_rs;
  std::cout<<total_interest_in_rs<<"\n"<<total_amount_in_rs<<"\n"<<discount_on_interest_in_rs<<"\n"<<final_settlement;
  return 0;
 }