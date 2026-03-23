#include <iostream>
using namespace std;

int main () {
    int ple = 0;
    int max = 0;
    
    for (int i = 0; i < 10; i++) {
        int out, in;
        cin >> out >> in;
        
        ple = ple - out + in;
        
        if (ple > max) {
            max = ple;
        }
    }
    
    cout << max;
    
    return 0;
}