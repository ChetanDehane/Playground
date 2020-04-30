#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s;
  cin.getline(s.name,50);
  cin>>s.roll>>s.marks;
  cout<<"\nStudent Details "<<"\n"<<"Name: "<<s.name<<"\n"<<"Roll: "<<s.roll<<"\n"<<"Marks: "<<s.marks<<"\n";
  return 0;
}