#include<iostream>
#include<cstring>
using namespace std;
struct college
{
  char name[100],city[100];
  int establishmentyear;
  float passpercentage;
};
int main()
{
  int n,i,j,count=1;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  college c[n];
  college t;
   for(i=0;i<n;i++)
   {
    cout<<"Enter the details of college "<<count<<endl;
    cout<<"Enter name"<<endl;
    cin>>c[i].name;
    cout<<"Enter city"<<endl;
    cin>>c[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>c[i].establishmentyear;
    cout<<"Enter pass percentage"<<endl;
    cin>>c[i].passpercentage;
     
    count++;
   }
  
   for(i=0;i<n;i++)
     {
          for(j=i+1;j<n;j++)
          {
               if(strcmp(c[i].name,c[j].name)>0)
               {
                    t=c[i];
                    c[i]=c[j];
                    c[j]=t;
               }
          }
     }  
  
    count=1;
    cout<<"Details of colleges"<<endl;
    for(i=0;i<n;i++)
    {
    cout<<"College:"<<count<<endl;
    cout<<"Name:"<<c[i].name<<endl<<"City:"<<c[i].city<<endl<<"Year of establishment:"<<c[i].establishmentyear<<endl<<"Pass percentage:"<<c[i].passpercentage<<endl;
    count++;
    }
    return 0;
}
