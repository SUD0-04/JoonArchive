#include <iostream>
using namespace std;

int main () {
    int n;
    cin >> n;
    
    long long total_sum = 0;
    
    for (int i = 0; i <= n; i++) {
        for (int j = i; j <= n; j++) {
            total_sum += (i + j);
        }
    }
    
    cout << total_sum;
    
    return 0;
}