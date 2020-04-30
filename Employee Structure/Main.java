#include<iostream>
using namespace std;
struct employee
{
  char name[20],designation[20];
  int id,age,salary;
};
int main()
{
  employee e;
  cout<<"Enter name:"<<endl;
  cin.getline(e.name,20);
  cout<<"Enter ID:"<<endl;
  cin>>e.id;
  cout<<"Enter age:"<<endl;
  cin>>e.age;
  cout<<"Enter designation:"<<endl;
  cin>>e.designation;
  cout<<"Enter Salary:"<<endl;
  cin>>e.salary;
  
  cout<<"Employee Details"<<endl<<"Name of the Employee : "<<e.name<<endl<<"ID of the Employee : "<<e.id<<endl<<"Age of the Employee : "<<e.age<<endl<<"Designation of the Employee : "<<e.designation<<endl<<"Salary of the Employee : "<<e.salary;
  return 0;
}