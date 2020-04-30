#include<iostream>
using namespace std;
int main()
{
  int i,n,no,no_val;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>no;
  if(no>n)
  {
    cout<<"Invalid Input"<<endl;
    return 0;
  }
  cout<<"Enter the value to insert"<<endl;
  cin>>no_val;
  cout<<"Array after insertion is"<<endl;
  n++;
  for(i=n;i>=no;i--)
  {
    a[i]=a[i-1];
  }
  a[no-1]=no_val;
  
  for(i=0;i<n;i++)
  {
    cout<<a[i]<<endl;
  }
  return 0;
}