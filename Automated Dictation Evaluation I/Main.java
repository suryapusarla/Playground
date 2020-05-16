#include<iostream>
using namespace std;
#include<string>
#include<bits/stdc++.h> 
int main()
{
char s1[50],s2[50];
  cin>>s1>>s2;
  int a=strcmp(s1,s2);
  if(a==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}