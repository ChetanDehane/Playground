#include<iostream>
using namespace std;
int main()
{
  int a1,b1,c1,a2,b2,c2,a3,b3,c3;               /* a,b,c are amount of shirt,discount,shipping prize
                                                where 1,2,3,are from flipkart,snapdeal and amazon*/
  cin>>a1>>b1>>c1>>a2>>b2>>c2>>a3>>b3>>c3;
  
  int finalprize1=(a1-(a1*b1/100)+c1);
  int finalprize2=(a2-(a2*b2/100)+c2);
  int finalprize3=(a3-(a3*b3/100)+c3);
  cout<<"In Flipkart Rs."<<finalprize1<<endl;
  cout<<"In Snapdeal Rs."<<finalprize2<<endl;
  cout<<"In Amazon Rs."<<finalprize3<<endl;
  
  
  if(finalprize1<=finalprize2&&finalprize1<=finalprize3)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(finalprize2<=finalprize3)
  {
    cout<<"He will prefer Snapdeal";
  }
  
  else
  {
    cout<<"He will prefer Amazon";
  }
  
  return 0;
 
}