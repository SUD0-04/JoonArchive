#include <iostream>
using namespace std;

int main () {
    
    int total = 0;
    int max = 0;
    
    for (int i = 0; i < 4; i++) {
        int op, ip;
        cin >> op >> ip;
        
        total -= op;
        total += ip;
        
        if (total > max) {
            max = total;
        }
    }
    
    cout << max;
    
    return 0;
}