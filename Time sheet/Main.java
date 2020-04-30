#include<iostream>
using namespace std;
int main()
{

  int d1,d2,d3,d4,d5,d6,d7,day1,day2,day3,day4,day5,day6,day7,hr;
  cin>>d7>>d1>>d2>>d3>>d4>>d5>>d6;
  int total_hr=d1+d2+d3+d4+d5;
  {
  if(d1<=8)
  {
    day1=d1*100;
  }
  else if(d1>8)
    {
      hr=d1-8;
    if(total_hr<=40)
    {
      day1=(d1*100)+(hr*15);
    }
     else if(total_hr>40)
        {
          day1=(d1*100)+(hr*25);
        }
   }
  }

{
  if(d2<=8)
  {
    day2=d2*100;
  }
  else if(d2>8)
    {
      hr=d2-8;
    if(total_hr<=40)
    {
      day2=(d2*100)+(hr*15);
    }
     else if(total_hr>40)
        {
          day2=(d2*100)+(hr*25);
        }
    }
}
{
  if(d3<=8)
  {
    day3=d3*100;
  }
  else if(d3>8)
    {
      hr=d3-8;
    if(total_hr<=40)
    {
      day3=(d3*100)+(hr*15);
    }
     else if(total_hr>40)
        {
          day3=(d3*100)+(hr*25);
        }
    }
}
{
  if(d4<=8)
  {
    day4=d4*100;
  }
  else if(d4>8)
    {
      hr=d4-8;
    if(total_hr<=40)
    {
      day4=(d4*100)+(hr*15);
    }
     else if(total_hr>40)
        {
          day4=(d4*100)+(hr*25);
        }
    }
}
{
   if(d5<=8)
  {
    day5=d5*100;
  }
  else if(d5>8)
    {
      hr=d5-8;
    if(total_hr<=40)
    {
      day5=(d5*100)+(hr*15);
    }
    else if(total_hr>40)
        {
          day5=(d5*100)+(hr*25);
        }
    }
}
  {
  if(total_hr<=40) 
  {
   day6=(d6*100)+(d6*100*25/100);
  }
    else
    {
      day6=0;
    }
  }
  {
  if(total_hr<=40)
  {
     day7=(d7*100)+(d7*100*50/100);
  }
    else
    {
      day7=0;
    }
  }

   int total_work=day1+day2+day3+day4+day5+day6+day7;

   cout<<total_work;
  return 0;
}
