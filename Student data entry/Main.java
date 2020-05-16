#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  cout<<"\n";
  cout<<"Student Details"<<endl;
  cin.getline(s.name,50)>>s.roll>>s.marks;
  cout<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks;
  
  
}