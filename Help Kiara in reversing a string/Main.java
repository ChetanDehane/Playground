#include <iostream>
using namespace std;
int main()
{
    char str[100],rev[100];
    int i,end,count=0;
    cin.getline(str,100);
    while(str[count]!='\0')
    {
        count++;
    }
    end=count-1;
    for (i=0;i<count;i++) 
    {
        rev[i]=str[end];
        end--;
    }
    cout<<rev;
}