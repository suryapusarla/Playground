
#include <iostream>
#include<string.h>
using namespace std;
struct student{
  char name[30]; 
  char department[20]; 
  int yearOfStudy; 
  float cgpa; 
};
int main()
{
  int n;
  char temp1[50],temp[50];
  int temp2;
  float temp3;
  cout<<"Enter the number of students\n";
  cin>>n;
  student s[n];
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<"\n";
    cout<<"Enter name\n\
Enter department\n\
Enter year of study\n\
Enter cgpa\n";
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
  cout<<"Details of students\n";
  for(int i=0;i<n;i++)
  {
    cout<<"Student "<<i+1<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
     cout<<"Department:"<<s[i].department<<"\n";
     cout<<"Year of study:"<<s[i].yearOfStudy<<"\n";
     cout<<"CGPA:"<<s[i].cgpa<<"\n";
   
  }
  
    
    
    
    
    
  
}