#include <iostream>
using namespace std;

int main () {
    int A, B;
    cin >> A >> B;
    
    int min_cheese = min(B, A - 1);
    
    cout << min_cheese + (min_cheese + 1);
    
    return 0;
}