#include <iostream>
using namespace std;

int main () {
    int a, b;
    cin >> a >> b;
    
    int sum_val = a + b;
    int sub_val  = a - b;
    
    if (sum_val > sub_val) {
        cout << sum_val << endl;
        cout << sub_val << endl;
    } else {
        cout << sub_val << endl;
        cout << sum_val << endl;
    }
    
    return 0;
}