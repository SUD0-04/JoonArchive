#include <iostream>
using namespace std;

int main () {
    int c;
    cin >> c;
    
    long total_sum = 0;
    
    for (int i = 0; i < c; i++) {
        int n, m;
        cin >> n >> m;
        
        int total_sum = n + m;
        
        cout << "Case " << i + 1 << ": " << total_sum << endl;
    }
    
    return 0;
}