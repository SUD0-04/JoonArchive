#include <iostream>
using namespace std;

int main (void) {
    int n;
    cin >> n;
    
    int sum = 0;
    
    for (int i = 0; i < n; i++) {
        int nums;
        cin >> nums;
        sum += nums;
    }
    
    cout << sum << endl;
    
    return 0;
}