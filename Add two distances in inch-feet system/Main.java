#include<iostream>
using namespace std;
 struct Distance {
    int feet;
    float inch;
} d1, d2, d;
  //Type your code here.
 

int main() {
    
    cin>>d1.feet;
  cin>>d1.inch;
  cin>>d2.feet;
  cin>>d2.inch;
   
    

    d.feet=d1.feet+d2.feet;
    d.inch=d1.inch+d2.inch;
   
    if (d.inch>12.0) {
        d.inch =d.inch-12.0;
        d.feet++;
    }
    cout<<d.feet<<"'-"<<d.inch<<'"';
    return 0;
}