#include<iostream>
using namespace std;
void sum(int *a,int n)
{
  int i,sumofeven=0,sumofodd=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      sumofeven=sumofeven+a[i];
    }
    else
    {
      sumofodd=sumofodd+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<sumofeven<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sumofodd;
}

int main()
{
  int n,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  sum(a,n);
  return 0;
}