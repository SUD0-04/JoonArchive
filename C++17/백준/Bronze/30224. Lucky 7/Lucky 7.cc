#include <iostream>
using namespace std;

int main (void) {
    int n;
    cin >> n;
    
    string s = to_string(n);
    
    bool Has7 = (s.find('7') != string::npos);
    bool Div7 = (n % 7) == 0;
    
    if (Has7 && Div7) {
        cout << 3;
    } else if (Has7 && !Div7) {
        cout << 2;
    } else if (!Has7 && Div7) {
        cout << 1;
    } else {
        cout << 0;
    }
    
    return 0;
}