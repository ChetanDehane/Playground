#include<iostream>
int power(int a,int count)
{
    int j,i;
    for(i=1,j=1;i<=count;i++)
        j=j*a;
    return j;
}
int arm(int n)
{
   int count=0,a,sum=0;
    int temp=n;
    int c=temp;
    while(n>0)
    {
        n=n/10;
        count++;
    }
    
    while(temp>0)
    {
        a=temp%10;
        temp=temp/10;
        sum=sum+power(a,count);
    }
    return (sum==c);
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}