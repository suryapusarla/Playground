#include <iostream>
#include<string.h>
using namespace std;
struct student{
  char name[100]; 
  char department[100]; 
  int yearOfStudy; 
  float cgpa; 
};
int main()
{
  int n;
  char temp1[100],temp[100];
  int temp2;
  float temp3;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  student s[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<"\n";
    cout<<"Enter name\n\
Enter city\n\
Enter year of establishment\n\
Enter pass percentage\n";
   cin>>s[i].name;
    cin>>s[i].department;
    cin>>s[i].yearOfStudy;
    cin>>s[i].cgpa;
  }
  for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
         if(strcmp(s[i].name,s[j].name)>0){
            strcpy(temp,s[i].name);
            strcpy(s[i].name,s[j].name);
            strcpy(s[j].name,temp);
           strcpy(temp1,s[i].department);
            strcpy(s[i].department,s[j].department);
            strcpy(s[j].department,temp1);
           temp2=s[i].yearOfStudy;
           s[i].yearOfStudy=s[j].yearOfStudy;
           s[j].yearOfStudy=temp2;
           temp3=s[i].cgpa;
           s[i].cgpa=s[j].cgpa;
           s[j].cgpa=temp3;
           
           
           
           
         }
      }
  }
  cout<<"Details of colleges\n";
  for(int i=0;i<n;i++)
  {
    cout<<"College:"<<i+1<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
     cout<<"City:"<<s[i].department<<"\n";
     cout<<"Year of establishment:"<<s[i].yearOfStudy<<"\n";
     cout<<"Pass percentage:"<<s[i].cgpa<<"\n";
   
  }
  
    
    
    
    
    
  
}