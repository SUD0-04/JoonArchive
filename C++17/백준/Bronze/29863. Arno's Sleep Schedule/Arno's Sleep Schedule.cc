#include <iostream>
using namespace std;

int main (void) {
    int sleep, wake;
    cin >> sleep >> wake;
    
    int total = 0;
    
    if (sleep >= 20) {
        total = (24 - sleep) + wake;
    } else {
        total = wake - sleep;
    }
    
    cout << total;
    
    return 0;
}