#include <iostream>
using namespace std;

int main (void) {
    int n;
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        int A, B, X;
        cin >> A >> B >> X;
        
        cout << A * (X - 1) + B << '\n';
    }
    
    return 0;
}