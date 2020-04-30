#include<iostream>
using namespace std;
int main()
{
  int no_rows,no_columns,tree_no,i;
  cin>>no_rows>>no_columns>>tree_no;
  int total_tree=no_rows*no_columns;
  int last_row=no_columns;
  int first_row=no_columns-(no_columns-1);
  
  /* to check tree no from 1st column  */
  
    for(i=1;i<=total_tree;i+=no_columns)
    {
      if(tree_no==i)
      {
        cout<<"Yes";
        return 0;
      }
    }
  
  /* to check tree no from last column  */
  
   for(i=no_columns;i<=total_tree;i+=no_columns)
    {
      if(tree_no==i)
      {
        cout<<"Yes";
        return 0;
      }
      
    }
  
  /* to check tree no from 1st row  */
  
  if(tree_no>=first_row&&tree_no<=last_row)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  return 0;
}