#include <iostream>
using namespace std;

int main () {
    int n;
    cin >> n;
    
    int total_sum = 0;
    
    for (int i = 0; i < n; i++) {
        int mt;
        cin >> mt;
        
        total_sum += mt;
    }
    
    cout << total_sum - (n- 1);
    
    return 0;
}