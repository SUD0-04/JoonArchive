#include <iostream>
using namespace std;

int main () {
    int price;
    cin >> price;
    
    for (int i = 0; i < 9; i++) {
        int r_price;
        cin >> r_price;
        
        price -= r_price;
    }
    
    cout << price;
    
    return 0;
}