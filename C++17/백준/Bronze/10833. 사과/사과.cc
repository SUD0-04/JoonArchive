#include <iostream>
using namespace std;

int main () {
    int n;
    cin >> n;
    
    int total_apls = 0;
    
    for (int i = 0; i < n; i++) {
        int apls, snts;
        cin >> apls >> snts;
        
        total_apls += snts % apls;
    }
    
    cout << total_apls;
    
    return 0;
}