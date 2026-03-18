#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cin >> str;

    string reversed = string(str.rbegin(), str.rend());

    if (str == reversed) {
        cout << 1;
    } else {
        cout << 0;
    }

    return 0;
}