#include<iostream>
using namespace std;
struct timeperiods
{
  int hours,minutes,seconds;
};
int main()
{
  timeperiods t1,t2,diff;
  cin>>t1.hours>>t1.minutes>>t1.seconds>>t2.hours>>t2.minutes>>t2.seconds;
  
  
   if (t2.seconds > t1.seconds) 
    {
        --t1.minutes;
        t1.seconds += 60;
    }
    diff.seconds = t1.seconds - t2.seconds;
   if (t2.minutes > t1.minutes) 
    {
        --t1.hours;
        t1.minutes += 60;
    }
    diff.minutes = t1.minutes - t2.minutes;
    diff.hours = t1.hours - t2.hours;

  cout<<diff.hours<<":"<<diff.minutes<<":"<<diff.seconds;
  return 0;
}