#include <iostream>
using namespace std;

int main (void) {
    int N1, N2, N12;
    
    cin >> N1 >> N2 >> N12;
    int result = ((N1 + 1) * (N2 + 1)) / (N12 + 1) - 1;
    
    cout << result << endl;
    
    return 0;
}