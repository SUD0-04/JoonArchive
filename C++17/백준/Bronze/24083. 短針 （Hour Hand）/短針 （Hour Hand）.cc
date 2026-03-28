#include <iostream>
using namespace std;

int main () {
    int a, b;
    cin >> a >> b;
    
    int result = (a + b) % 12;
    
    if (result == 0) {
        cout << 12;
    } else {
        cout << result;
    }
    
    return 0;
}