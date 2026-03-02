#include <iostream>
using namespace std;

int main (void) {
    int N, A, B;
    cin >> N >> A >> B;
    
    if (A > B) {
        cout << "Subway" << endl;
    } else if (A < B) {
        cout << "Bus" << endl;
    } else {
        cout << "Anything" << endl;
    }
    
    return 0;
}