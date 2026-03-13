#include <iostream>
using namespace std;

int main () {
    int t;
    cin >> t;
    
    for (int i = 0; i < t; i++) {
        int n;
        cin >> n;
        
        int total_sum = 0;
        
        for (int j = 0; j < n; j++) {
            int num;
            cin >> num;
            total_sum += num;
        }
        cout << total_sum << endl;
    }
    return 0;
}