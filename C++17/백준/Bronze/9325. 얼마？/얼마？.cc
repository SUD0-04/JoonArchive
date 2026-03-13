#include <iostream>
using namespace std;

int main () {
    int c;
    cin >> c;
    
    for (int i = 0; i < c; i++) {
        long long s, n;
        cin >> s >> n;
        
        
        long long op_sum = 0;
        
        for (int j = 0; j < n; j++) {
            long long q, p;
            cin >> q >> p;
            
            if (q == 0) {
                break;
            }
            
            op_sum += q * p;
        }
        cout << s + op_sum << endl;
    }
}