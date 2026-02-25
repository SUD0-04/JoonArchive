#include <iostream>
#include <string>
using namespace std;

int main (void) {
    int c;
    if (!(cin >> c)) return 0;

    for (int i = 0; i < c; i++) {
        string pwd;
        cin >> pwd;

        if (pwd.length() >= 6 && pwd.length() <= 9) {
            cout << "yes" << endl;
        } else {
            cout << "no" << endl;
        }
    }

    return 0;
}