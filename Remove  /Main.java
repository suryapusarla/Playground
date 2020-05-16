
#include <bits/stdc++.h> 
using namespace std; 


void removeSpecialCharacter(string s) 
{ 
	for (int i = 0; i < s.size(); i++) { 
		
		
		if (s[i] =='t'&& 
			s[i+1]== 'h' &&s[i+2] == 'e') 
		{ 
			
			s.erase(i, 4); 
          
			i--; 
		} 
	} 
	cout << s; 
} 

int main() 
{ 
	string s;
   std::getline(std::cin,s);
	removeSpecialCharacter(s); 
	return 0; 
} 
