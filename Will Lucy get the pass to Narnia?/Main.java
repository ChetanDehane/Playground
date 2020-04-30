#include<iostream>
int main()
{
 int a,b,c,d,e,f,g,menu;
  std::cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>a>>b>>menu;
  switch(menu)
  {
    case 1: c=a+b;
            std::cout<<c;
            break;
    case 2: d=a-b;
            std::cout<<d;
            break;
   case 3: e=a*b;
            std::cout<<e;
            break;
   case 4: f=a/b;
            std::cout<<f;
            break;
   case 5: g=a%b;
            std::cout<<g;
            break;
   default : std::cout<<"Invalid operation";
            break;
  }
  return 0;
}
      