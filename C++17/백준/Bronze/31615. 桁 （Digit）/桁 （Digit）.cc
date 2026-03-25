#include <iostream>
#include <string>
using namespace std;

int main () {
    int A, B;
    cin >> A >> B;
    
    cout << to_string(A + B).length();
    
    return 0;
}