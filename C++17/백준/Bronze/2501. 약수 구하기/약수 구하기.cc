#include <iostream>
using namespace std;

int main () {
    int n, k;
    cin >> n >> k;
    
    int result = 0;
    int count = 0;
    
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count++;
            if (count == k) {
                result = i;
                break;
            }
        }
    }
    
    cout << result;
    
    return 0;
}