#include <iostream>
#include <string>
using namespace std;

int main () {
    int n;
    string s;
    
    cin >> n >> s;
    
    for (int i = 1; i < n; i++) {
        if (s[i] == 'J') {
            cout << s[i - 1] << endl;
        }
    }
    
    return 0;
}