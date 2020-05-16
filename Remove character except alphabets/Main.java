#include<string>
#include<iostream>
using namespace std;
int main()
{
    char s[200];
    int i, j;
    cin >> s;

    for(i = 0; s[i] != '\0'; ++i)
    {
        while (!( (s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z') || s[i] == '\0') )
        {
            for(j = i; s[j] != '\0'; ++j)
            {
                s[j] = s[j+1];
            }
            s[j] ='\0';
        }
               }
    cout << s;
    cout << endl;
    return 0; 
}