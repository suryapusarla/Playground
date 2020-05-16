#include <iostream>
#include<string.h>
using namespace std;
struct time{
  int h;
  int m;
  int s;
}t1,t2,t3;
int main()
{
  
  cin>>t1.h>>t1.m>>t1.s;
  cin>>t2.h>>t2.m>>t2.s;
  if(t1.s>=t2.s)
  {
    t3.s=(t1.s-t2.s);
  }
  else
  {
    t3.s=60+(t1.s-t2.s);
    t1.m--;
  }
  if(t1.m>=t2.m)
  {
    t3.m=(t1.m-t2.m);
  }
  else
  {
    t3.m=60+(t1.m-t2.m);
    t1.h--;
  }
  t3.h=t1.h-t2.h;
  cout<<t3.h<<":"<<t3.m<<":"<<t3.s;
  
  
  
  
   
  }
  
    
