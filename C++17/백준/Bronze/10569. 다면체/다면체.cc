// T, V, E

#include <iostream>
using namespace std;

int main () {
    int t;
    cin >> t;
    
    for (int i = 0; i < t; i++) {
        int v, e;
        cin >> v >> e;
        
        long long f = ((v - e - 2) < 0) ? -(v - e - 2) : (v - e - 2);
        
        cout << f << endl;
    }
    
    return 0;
}