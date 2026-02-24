#include <iostream>
using namespace std;

int main (void) {
    int T, F, K, P, S;
    int sumA = 0;
    int sumB = 0;
    
    cin >> T >> F >> K >> P >> S;
    sumA += (T * 6) + (F * 3) + (K * 2) + (P * 1) + (S * 2);
    
    cin >> T >> F >> K >> P >> S;
    sumB += (T * 6) + (F * 3) + (K * 2) + (P * 1) + (S * 2);
    
    cout << sumA << " " << sumB << endl;
    
    return 0;
}