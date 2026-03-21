#include <iostream>
#include <climits>
using namespace std;

int main() {
    int n;
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        int sum = 0;
        int min = INT_MAX;
        
        for (int j = 0; j < 7; j++) {
            int num;
            cin >> num;
            if (num % 2 == 0) {
                sum += num;
                if (num < min) {
                    min = num;
                }
            }
        }
        cout << sum << " " << min << endl;
    }
    
    return 0;
}