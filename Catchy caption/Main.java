#include <iostream>
#include <cstring>
using namespace std;
int main()
{
   char caption[100];
   cin.getline(caption,100);
   int length=strlen(caption);
   string a={"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"};
  int count=0;
   for(int i=0;i<length;i++)
   {
     for(int j=0;j<a.length();j++)
     {
      if(caption[i]==a[j])
      {
        count++;
        break;
      }
       else
       {
         continue;
       }
     }
   }
  
   if(count<=20)
  {
    cout<<"Caption eligible for the contest";
  }
  else
  {
    cout<<"Caption not eligible for the contest";
  }  
    return 0;
}