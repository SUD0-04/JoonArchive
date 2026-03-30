#include <iostream>
using namespace std;

int main () {
    int s, a, b;
    cin >> s >> a >> b;
    
    int total_price = 250;
    int current_h = a;
    
    if (a > s) {
        cout << 250;
    } else {
        while (current_h < s) {
            current_h += b;
            total_price += 100;
        }
        cout << total_price;
    }
    
    return 0;
}