#include <iostream>
using namespace std;

int main (void) {
    int N, M;
    cin >> N >> M;
    
    int result = (N * 100) - M;
    
    if (result >= 0) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
    
    return 0;
}