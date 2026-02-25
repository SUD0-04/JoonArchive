#include <iostream>
using namespace std;

int main (void) {
    int N;
    cin >> N;

    int repeat = N / 4;

    for (int i = 0; i < repeat; i++) {
        cout << "long ";
    }

    cout << "int" << endl;

    return 0;
}