#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  float score=0.0;
  while(cin>>a)
  {
    if(a%2==0&&a>=0)
    {
      score=score-0.5;
    }
    else if(a<0)
    {
      score=score-1;
    }
    else
    {
      score=score+1;
    }
  }
  cout<<fixed<<setprecision(1)<<score;
  return 0;
}