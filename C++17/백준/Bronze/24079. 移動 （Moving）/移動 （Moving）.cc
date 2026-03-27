#include <iostream>
using namespace std;

int main () {
    int x, y, z;
    cin >> x >> y >> z;
    
    int total_time = x + y;
    
    if (total_time <= z) {
        cout << 1;
    } else {
        cout << 0;
    }
    
    return 0;
}