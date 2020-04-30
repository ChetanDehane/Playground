#include<iostream>
#include<cstring>
using namespace std;
struct student
{
  char name[30],department[20];
  int yearofstudy;
  float cgpa;
};
int main()
{
  int n,i,j,count=1;
  cout<<"Enter the number of students"<<endl;
  cin>>n;
  student s[n];
  student t;
   for(int i=0;i<n;i++)
   {
    cout<<"Enter the details of student "<<count<<endl;
    cout<<"Enter name"<<endl;
    cin>>s[i].name;
    cout<<"Enter department"<<endl;
    cin>>s[i].department;
    cout<<"Enter year of study"<<endl;
    cin>>s[i].yearofstudy;
    cout<<"Enter cgpa"<<endl;
    cin>>s[i].cgpa;
     
    count++;
   }
  
   for(i=0;i<n;i++)
     {
          for(j=i+1;j<n;j++)
          {
               if(strcmp(s[i].name,s[j].name)>0)
               {
                    t=s[i];
                    s[i]=s[j];
                    s[j]=t;
               }
          }
     }  
  
    count=1;
    cout<<"Details of students"<<endl;
    for(int i=0;i<n;i++)
    {
    cout<<"Student "<<count<<endl;
    cout<<"Name:"<<s[i].name<<endl<<"Department:"<<s[i].department<<endl<<"Year of study:"<<s[i].yearofstudy<<endl<<"CGPA:"<<s[i].cgpa<<endl;
    count++;
    }
    return 0;
}
