#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string a;
  getline(cin,a);
  string vowels={"aeiouAEIOU"},consonants={"bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVXZWY"},digits={"0123456789"},symbols={"~?.,!@#$%^&*-=+/':;"};
  int i,j,vowel=0,digit=0,symbol=0,consonant=0;
  
  for(i=0;i<a.length();i++)
  {
    for(j=0;j<vowels.length();j++)
    {
      if(a[i]==vowels[j])
      {
        vowel++;
        goto l;
      }
    }
    for(j=0;j<symbols.length();j++)
    {
      if(a[i]==symbols[j])
      {
        symbol++;
        goto l;
      }
    }
    for(j=0;j<digits.length();j++)
    {
      if(a[i]==digits[j])
      {
        digit++;
        goto l;
      }
    }
    
     for(j=0;j<consonants.length();j++)
    {
      if(a[i]==consonants[j])
      {
        consonant++;
        goto l;
      }
    }
   l: ;
}
  
  
  int whitespaces=a.length()-(vowel+digit+symbol+consonant);
  cout<<"Vowels:"<<vowel<<endl<<"Consonants:"<<consonant<<endl<<"White Spaces:"<<whitespaces<<endl<<"Digits:"<<digit<<endl<<"Symbols:"<<symbol;
  return 0;
}
