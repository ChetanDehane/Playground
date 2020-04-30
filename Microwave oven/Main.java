#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int no_items;
  float single_item_heating_time,heating_time_2,heating_time_3;
  cin>>no_items>>single_item_heating_time;
  if(no_items==1)
  {
    cout<<single_item_heating_time;
  }
  else if(no_items==2)
  {
   heating_time_2=single_item_heating_time+(single_item_heating_time*50/100);
   cout<<fixed<<setprecision(2)<<heating_time_2;
  }
  else if(no_items==3)
  {
    heating_time_3=2*single_item_heating_time;
    cout<<fixed<<setprecision(2)<<heating_time_3;
  }
  else
  {
    cout<<"Number of items is more";
  }
  
  return 0;
  
}