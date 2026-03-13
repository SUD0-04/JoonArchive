#include <iostream>
using namespace std;

int main () {
    int ct;
    cin >> ct;
    
    
    
    for (int i = 0; i < ct; i++) {
        long long c, v;
        cin >> c >> v;
        
        long long p1 = c / v;
        long long p2 = c % v;
        
        cout << "You get " << p1 << " piece(s) and your dad gets " << p2 << " piece(s)." << endl;
    }
    
    return 0;
}