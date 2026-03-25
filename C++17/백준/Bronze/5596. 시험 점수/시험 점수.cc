#include <iostream>
using namespace std;

int main () {
    int s1 = 0;
    int s2 = 0;
    
    for (int i = 0; i < 4; i++) {
        int sc1;
        
        cin >> sc1;
        s1 += sc1;
    }
    
    for (int i = 0; i < 4; i++) {
        int sc2;
        
        cin >> sc2;
        s2 += sc2;
    }
    
    if (s1 > s2) {
        cout << s1;
    } else {
        cout << s2;
    }
    
    return 0;
}