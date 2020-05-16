#include<iostream>
using namespace std;
struct emp
{
char n[20];
  int id;
  int cage;
  char des[20];
  int sal;
};
int main()
{
  //Type your code here.
 struct emp s;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details"<<endl;
  cin>>s.n>>s.id>>s.cage>>s.des>>s.sal;
  cout<<"Name of the Employee : "<<s.n<<endl;
cout<<"ID of the Employee : "<<s.id<<endl;
cout<<"Age of the Employee : "<<s.cage<<endl;
cout<<"Designation of the Employee : "<<s.des<<endl;
 cout<<"Salary of the Employee : "<<s.sal<<endl;



}