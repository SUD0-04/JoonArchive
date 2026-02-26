#include <iostream>
using namespace std;

int main (void) {
    bool isFailed = false;
    
    for (int i = 0; i < 8; i++) {
        int n;
        cin >> n;
        if (n == 9) {
            isFailed = true;
            break;
        }
    }
    
    if (isFailed) {
        cout << "F" << endl;
    } else {
        cout << "S" << endl;
    }
    
    return 0;
}