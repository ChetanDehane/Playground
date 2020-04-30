#include<iostream>
using namespace std;
struct complex
{
  int r1,c1,r2,c2,rsum,csum,rsub,csub,rmul,cmul;
  int choice;
};
int main()
{
  complex c;
  cin>>c.choice>>c.r1>>c.c1>>c.r2>>c.c2;
  switch(c.choice)
  {
    case 1: c.rsum=(c.r1+c.r2);
            c.csum=(c.c1+c.c2);
            if(c.csum>=0)
              cout<<c.rsum<<"+"<<c.csum<<"i";
            else
              cout<<c.rsum<<c.csum<<"i";
            break;
    case 2: c.rsub=(c.r1-c.r2);
            c.csub=(c.c1-c.c2);
            if(c.csub>=0)
               cout<<c.rsub<<"+"<<c.csub<<"i";
            else
               cout<<c.rsub<<c.csub<<"i";
            break;
    case 3: c.rmul=(c.r1*c.r2-c.c1*c.c2);
            c.cmul=(c.r1*c.c2+c.c1*c.r2);
              if(c.cmul>=0)
               cout<<c.rmul<<"+"<<c.cmul<<"i";
            else
               cout<<c.rmul<<c.cmul<<"i";
            break;
    default: cout<<"Invalid choice";
  }
  return 0;
}
  