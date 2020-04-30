#include <iostream>
using namespace std;
int main()
{
    string str1,str2;
    int i,end,count=0,flag=0;
    cin>>str1>>str2;
    while(str1[count]!='\0')
    {
        count++;
    }
    end=count-1;
    for (i=0;i<count;i++) 
    {
        if(str1[i]==str2[end])
        {
            end--;
          flag=0;
        }
      else
      {
        flag=1;
        break;
      }
    }
  if(flag==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }    
   return 0; 
}