#include<iostream>
using namespace std;
int evenodd(int *a,int n)
{
  int i,even=0,odd=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      even++;
    }
    else
    {
      odd++;
    }
  }
  if(odd==0)
  {
    return 1;
  }
  else if(even==0)
  {
    return 2;
  }
  else
  {
    return 3;
  }
}
int main()
{
  int n,i;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  evenodd(a,n);
  if(evenodd(a,n)==1)
    cout<<"The array is Even";
  else if(evenodd(a,n)==2)
  {
    cout<<"The array is Odd";
  }
  else
  {
    cout<<"The array is Mixed";
  }
  return 0;
}