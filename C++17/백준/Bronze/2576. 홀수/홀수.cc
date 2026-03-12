#include <iostream>
using namespace std;

int main() {
    int min_val = 101;
    int sum = 0;
    
    for (int i = 0; i < 7; i++) {
        int n;
        cin >> n;
        
        if (n % 2 != 0) { 
            sum += n;
            
            if (n < min_val) {
                min_val = n;
            }
        }
    }
    
    if (sum == 0) {
        cout << "-1" << "\n";
    } else {
        cout << sum << "\n";
        cout << min_val << "\n";
    }
    
    return 0;
}