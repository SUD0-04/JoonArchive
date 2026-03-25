#include <iostream>
using namespace std;

int main () {
    
    int burger = 2001;
    int drink = 2001;
    
    for (int i = 0; i < 3; i++) {
        int val;
        cin >> val;
        
        if (val < burger) {
            burger = val;
        }
    }
    
    for (int i = 0; i < 2; i++) {
        int val;
        cin >> val;
        
        if (val < drink) {
            drink = val;
        }
    }
    
    cout << burger + drink - 50;
    
    return 0;
}