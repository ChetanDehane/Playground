#include<iostream>
using namespace std;
void printresult(int *a,int n,int s)
{
  int sum=0;
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=s)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
}

int main()
{
  int n,s,i;
  cin>>n>>s;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  printresult(a,n,s);
  return 0;
}
