#include <iostream>
using namespace std;

int main (void) {
    int A, B, C, D;
    
    cin >> A >> B >> C >> D;
    
    int result = (A * 56) + (B * 24) + (C * 14) + (D * 6);
    
    cout << result << endl;
    
    return 0;
}