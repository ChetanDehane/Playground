#include<iostream>
using namespace std;
int main()
{
  int petrol_avl_liter,distance_to_travel;
  float mileage;
  cin>>mileage>>petrol_avl_liter>>distance_to_travel;
  float distance_can_travel_avl_petrol=(float)mileage*petrol_avl_liter;
  if(distance_to_travel<=distance_can_travel_avl_petrol)
  {
   cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach"; 
  }
  return 0;

}