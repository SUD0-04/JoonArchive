#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cin >> n;
    
    string s;
    cin >> s;
    
    bool found = false;
    
    for (int i = 0; i + 2 < n; i++) {
        if (s[i] == 'o' && s[i + 1] == 'o' && s[i + 2] == 'o') {
            found = true;
            break;
        }
    }
    
    if (found) {
        cout << "Yes";
    } else {
        cout << "No";
    }
    
    return 0;
}